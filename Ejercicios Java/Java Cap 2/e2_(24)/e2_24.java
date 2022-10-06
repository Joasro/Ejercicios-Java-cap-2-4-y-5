
import java.util.Scanner;
public class e2_24 {
    public static void main( String args[])
    {           // Abre el metodo main
    Scanner entrada = new Scanner(System.in);
     
    int n1;
    int n2;
    int n3;
    int n4;
    int n5;
     
    System.out.print("Primer numero: ");
    n1 = entrada.nextInt();
     
    System.out.print("Segundo numero: ");
    n2 = entrada.nextInt();
     
    System.out.print("Tercer numero: ");
    n3 = entrada.nextInt();
     
    System.out.print("Cuarto numero: ");
    n4 = entrada.nextInt();
     
    System.out.print("Quinto numero: ");
    n5 = entrada.nextInt();
    
     
    int menor = n1;
     
    if ( n2 < menor)
    menor = n2;
    if ( n3 < menor)
    menor = n3;
    if (n4 < menor)
    menor = n4;
    if (n5 < menor)
    menor = n5;

     
    int mayor = n1;
     
    if (n2 > mayor)
    mayor = n2;
    if (n3 > mayor)
    mayor = n3;
    if (n4 > mayor)
    mayor = n4;
    if(n5 > mayor)
    mayor = n5;
     
    System.out.printf("\nEl numero menor es: %d\n", menor);
    System.out.printf("\nEl numero mayor es: %d\n", mayor);
    }          
    } 