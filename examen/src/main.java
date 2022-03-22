import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner inputData = new Scanner(System.in);
       int numero, i=1, Hamburguesas =0,perro=0, salchipapas = 0, chorizo=0;
       int plato = 0, propina=0;
       double totaldescuento20=0, totalpago20=0, tdescuento10=0, tpago10=0,totalpropina=0,pagopropina=0,total=0;
       System.out.println("ingrese el número de personas ");
       numero = inputData.nextInt();
       for (i=1; i<=numero; i++){
           System.out.println("Ingrese el plato que desea: (Hamburguesa = 1, Perro = 2, Salchipapas = 3, Chorizo=4 ");
            plato = inputData.nextInt();

            if (plato ==1){
                Hamburguesas++;
            }
         else if (plato ==2){
             perro++;
            }
         else if (plato ==3){
             salchipapas++;
            }
         else if (plato==4){
             chorizo++;
            }
         else {
             System.out.println("El plato no existe en el menù");
            }
       }
     total = (Hamburguesas * 10000) + (perro * 8000) + (salchipapas * 6000) + (chorizo * 7000);
       System.out.println("¿Desea incluir la propina? si = 1, NO = 2 ");
       propina = inputData.nextInt();
       if (total >= 20000 && propina == 1){
           totaldescuento20 = total * 0.10;
           totalpago20 =  total - totaldescuento20;
           totalpropina = totalpago20 * 0.10;
           pagopropina = totalpago20 + totalpropina;
           System.out.println("El total a pagar por realizar compras mayores a 20.000 es de$: "+totalpago20);
           System.out.println("El valor a pagar con propina icluida del 10% es de$: "+pagopropina);

       }
       else if  (propina == 1 && Hamburguesas >=2 || perro >=2 || salchipapas >=2 || chorizo >=2){

           tdescuento10 = total * 0.05;
           tpago10 =  total - tdescuento10;
           totalpropina = tpago10 * 0.10;
           pagopropina = tpago10 + totalpropina;
           System.out.println("El total a pagar por comprar 2 o mas platos iguales es de: "+tpago10);
           System.out.println("El valor a pagar con propina icluida del 10% es de$: "+pagopropina);
        }

        else {
           System.out.println("El total a pagar es de: "+ total);
       }

    }
}
