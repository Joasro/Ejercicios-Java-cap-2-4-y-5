import java.util.Scanner;

public class e5_12 {
   
   public static void main(String[] args) {
    Scanner sm= new Scanner(System.in);
    int product=1;
    
    for(int i=1;i<16;i+=2){
        System.out.println("Impar:"+i);
        product=product*i;
   } 
   System.out.println("El producto de los impares es: "+product);
}
}