//*nose */
import java.util.Scanner; 

public class e2_15
{
   public static void main(String[] args)
   {
    Scanner input = new Scanner(System.in);

      int n1;
      int n2;
      int suma;
      int diferencia;
      int producto;
      int cociente;

      System.out.print("Ingrese el primer numero: ");  
      n1 = input.nextInt();

      System.out.print("Ingrese el segundo numero: ");  
      n2 = input.nextInt();
    
      suma = n1 + n2;
      diferencia = n1 - n2;
      producto = n1*n2;
      cociente = n1/n2;

      System.out.printf("La suma es %d%n", suma);
      System.out.printf("La diferencia entre los 2 numeros es %d%n", diferencia);
      System.out.printf("El producto es %d%n", producto);
      System.out.printf("El cociente %d%n", cociente);
   }
} 