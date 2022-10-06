
import java.util.Scanner;


public class e4_19 {

public static void main(String[] args) {



double art1= 0;

double art2= 0;

double art3= 0;

double art4= 0;

double cms= 200; 

double comv= 0.09;

double arts= art1 + art2 + art3 + art4;

double ti;


Scanner input = new Scanner(System.in);


System.out.print("Ingrese la cantidad vendida del articulo 1: ");

art1 = input.nextInt();

art1 *= 239.99;


System.out.println();



System.out.print("Ingrese la cantidad vendida del articulo 2: ");

art2 = input.nextInt();

art2 *= 129.75;


System.out.println();



System.out.print("Ingrese la cantidad vendida del articulo 3: ");

art3 = input.nextInt();

art3 *= 99.95;

System.out.println();



System.out.print("Ingrese la cantidad vendida del articulo 4: ");

art4 = input.nextInt();

art4 *= 350.89;


System.out.println();



arts= art1 + art2 + art3 + art4;

ti= cms + (arts*comv);



System.out.println("\n");

System.out.printf ("Tu comisión semanal es de: %.2f\n", ti);


System.out.println("\n");

   }
}