public class e5_21

/*ternas */
{   
public static void main(String[] args) {
    
    { 
    int huevada = 500;

    for ( int i = 1; i <= huevada; i++ )
    for ( int j = 1; j <= huevada; j++ )
    for ( int k = 1; k <= huevada; k++ )
    {    
    if ( i*i == j*j + k*k )
    System.out.printf("%3d\t%3d\t%3d\n", i, j, k);
    }     
   }  
  }
 }     