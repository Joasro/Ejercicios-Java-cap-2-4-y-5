import java.util.Scanner;

  public class e5_17

  {       
  public static void main(String[] args)

  {  
   float mt= 0;
   int nump;
   int cv;

  Scanner entrada = new Scanner(System.in); 
  System.out.println("Bienvenido al mercadito *Catrachito 504 Hn Dku* ");
  System.out.println("Precios de los productos:");
  System.out.println("Producto 1: $2.98");
  System.out.println("Producto 2: $4.50");
  System.out.println("Producto 3: $9.98");
  System.out.println("Producto 4: $4.49");
  System.out.println("Producto 5: $6.87\n");

  System.out.println("Introduzca el numero del primer producto a llevar:");
  System.out.println("( -1 para terminar).");
  nump = entrada.nextInt(); 

  while ( -1 != nump )
  {    
   
  switch ( nump )
  {  

  case 1:
  {  

  System.out.println("Introduzca la cantidad vendida de este producto:");
  cv = entrada.nextInt();
  System.out.printf("Precio de esta venta: %f", cv*2.98);
  mt += cv*2.98;
  break;
  } 

  case 2:
  {   

  System.out.println("Introduzca la cantidad vendida de este producto:");
  cv = entrada.nextInt();
  System.out.printf("\nPrecio de esta venta: %f", cv*4.50);
  mt += cv*4.50;
  break;
  } 
  case 3:
  { 

  System.out.print("\nIntroduzca la cantidad vendida de este producto:");
  cv = entrada.nextInt();
  System.out.printf("\nPrecio de esta venta: %f", cv*9.98);
  mt += cv*9.98;
  break;
  } 

   
  case 4:
  {   

  System.out.print("\nIntroduzca la cantidad vendida de este producto:");
  cv = entrada.nextInt();
  System.out.printf("\nPrecio de esta venta: %f", cv*4.49);
  mt += cv*4.49;
  break;
  }  

  case 5:
  {   

  System.out.print("\nIntroduzca la cantidad vendida de este producto:");
  cv = entrada.nextInt();
  System.out.printf("\nPrecio de esta venta: %f", cv*6.87);
  mt += cv*6.87;
  break;
  }  


  default :
  {    

  System.out.print("\nNo es un producto valido!");
  break;
  }  

  }   

  System.out.println("\nIntroduzca el siguiente producto:");
  System.out.println("( -1 para terminar).");
  nump = entrada.nextInt(); 


  }     

  System.out.printf("\nVenta total de: %f\n\n", mt);
  }          

  }        