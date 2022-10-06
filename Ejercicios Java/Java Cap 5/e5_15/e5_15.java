public class e5_15 
{              
    public static void main(String[] args)
 {

int cosoese = 10;
{       

System.out.println("\n");

for ( int i = 1; i <= cosoese; i++ )
{           
for ( int j = 1; j <= i; j++ )
System.out.print("*");

for ( int k = i + 1; k <= cosoese; k++)
System.out.print(" ");

System.out.print(" ");
System.out.print(" ");
System.out.print(" ");
System.out.print(" ");

for ( int l = 1; l <= cosoese + 1 - i; l++ )
System.out.print("*");

for ( int m = cosoese - 1 -i; m <= cosoese; m++)
System.out.print(" ");

System.out.print(" ");
System.out.print(" ");
System.out.print(" ");
System.out.print(" ");

for ( int n = 1; n < i; n++ )
System.out.print(" ");
   
for ( int p = i; p <= cosoese; p++ )
System.out.print("*");

System.out.print(" ");
System.out.print(" ");
System.out.print(" ");
System.out.print(" ");

for ( int q = 1; q <= cosoese - i; q++ )
System.out.print(" ");

for ( int r = cosoese - i; r < cosoese; r++ )
System.out.print("*");

System.out.println();
}           

System.out.println("\n");
}       
}
}