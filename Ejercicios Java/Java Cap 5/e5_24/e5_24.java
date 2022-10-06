import java.util.Scanner;


   public class e5_24
   {     
   public static void main(String[] args) 
   {    
    int coso = 9;
   Scanner input = new Scanner(System.in);
   int x = 4; 

   while ( x % 2 == 0 )
   {  

   System.out.println("Introduzca un entero impar para hacer un rombito: ");
   x = input.nextInt();

   }   

   coso = x;

   System.out.println("\nRombo: \n\n");

   for ( int i = 1; i <= ((coso/2) + 1); i ++ )
   {
          
   for ( int  k = 1; k <= coso/ 2 - i + 1; k++ )
   System.out.printf(" ");
                               
   for ( int j = (coso/ 2) - i + 2; j <= (coso / 2) + i; j++ )  
   System.out.printf("*");


   System.out.printf("\n"); 
    
   }

   for ( int l = 1; l <= coso / 2; l++ )
   {

   for( int m = 1; m <= l; m++ )
   {
   
   System.out.printf(" "); 
   
   }     

   for (int n = l + 1; n <= coso - l  ; n++)
   System.out.printf("*");

    
   System.out.println();

   }    
  }     
 }         