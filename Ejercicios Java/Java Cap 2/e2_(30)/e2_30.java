import java.util.Scanner;
  
public class e2_30
{
public static void main(String arg[])
{  
Scanner input = new Scanner(System.in);
int n;
 
System.out.println("Ingrese un numero de cinco cifras para mostrar cada digito separado.");
n = input.nextInt();
  
System.out.printf("%d ",   n/10000);
System.out.printf("%d ", (n%10000)/1000);
System.out.printf("%d ", ((n%10000)%1000)/100);
System.out.printf("%d ", (((n%10000)%1000)%100)/10);
System.out.printf("%d\n ", ((((n%10000)%1000)%100)%10));
}     
}      