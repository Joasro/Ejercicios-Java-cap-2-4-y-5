import java.util.Scanner;
public class e5_11 {
    public static void main(String[] args) {
     Scanner scanner=new  Scanner (System.in);

     System.out.print("Digite la cantidad de numeros a evaluar: "); 

     int cantn= scanner.nextInt();
     int nmenor=0;
     int nmayor=0;

     for (int i = 0; i < cantn; i++){
        System.out.println("Digite el número en la posición "+(i+1));
        int tmp=scanner.nextInt();
        if (i==0){
            nmenor=tmp;
            nmayor=tmp;
        }else if (tmp<nmenor){
          nmenor=tmp;  
        }
        if(tmp>nmayor){
           nmayor=tmp; 
        }
     }

        System.out.println("El numero menor es: "+nmenor);
        System.out.print("El numero mayor es: "+nmayor);
  }
}
