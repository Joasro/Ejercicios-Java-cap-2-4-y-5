public class e4_22
 {
public static void main(String[] args)
{
     int cont=1;
     System.out.print("N"+"\t"+"10*N"+"\t"+"100*N"+"\t"+"1000*N");
     while(cont<6)
     {
    System.out.println();
    System.out.print(cont+"\t"+(cont*10)+"\t"+(cont*100)+"\t"+(cont*1000));
cont++;
}
}
}