import java.util.Scanner;

public class e2_16

{
    public static void main (String[]args)
    {
        int a,b;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        a = entrada.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        b = entrada.nextInt();
        if (a>b)
            System.out.print(a + " es mas grande");
        if (a<b)
            System.out.print(b + " es mas grande");
        if (a==b)
            System.out.print("Estos numeros son iguales");
    }
}
