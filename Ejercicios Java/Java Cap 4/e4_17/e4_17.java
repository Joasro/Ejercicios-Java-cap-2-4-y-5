import java.util.Scanner;

public class e4_17
{
public static void main(String[] args)
{
Scanner entrada = new Scanner( System.in );

int km = 0;
int lts = 0;
double kmLitro;
double totalKm = 0;
double totalLitros = 0;


System.out.print("Escriba los kilometros ó escriba -1 para terminar: ");
km = entrada.nextInt();


while( km != -1 )
{
System.out.print("Escriba la cantidad de litros usados en el trayecto: ");
lts = entrada.nextInt();
kmLitro = km/lts;
System.out.printf("Kilometros por litros obtenidos en este viaje: %.2f\n",kmLitro);

totalKm += km;
totalLitros += lts;


System.out.print("Escriba los kilometros conducidos o -1 para terminar: ");
km = entrada.nextInt();
}

if(totalKm != 0)
{
System.out.printf("Total de kilometros por litro obtenidos en todos los abastecimientos: %.2f\n",totalKm/totalLitros);
}
else
System.out.println("No se introdujeron datos");
}
}