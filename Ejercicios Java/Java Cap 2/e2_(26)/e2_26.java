import java.util.Scanner;
   
public class e2_26   
{
public static void main(String arg[])
{
Scanner input = new Scanner(System.in);
int n1;
int n2;
int my;
int mn;

System.out.println("Introduzca el primer numero:");
n1= input.nextInt();
  
System.out.println("Introduzca el segundo numero:");
n2 = input.nextInt();
 
my = n1;
mn = n2;
 
if ( n2 > n1 )
{          
my = n2;
mn = n1;
}

if ( 0 == my % mn )
System.out.printf("\nEl numero %d si es multiplo del numero %d\n", my, mn);
 
if ( 0 != my % mn )
System.out.println("\nLos numeros no son multiplos.");
 
}
 
}
    

