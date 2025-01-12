package examenes.bucles.normal;
import java.util.Scanner;
// Para poder analizar la complejidad del ejercicio
// deberás compararlo con Punto3_arbolitosConBuclesAnidados
// Se ha documentado las modificaciones respecto el primer código.
// Entre paréntesis aparece una valoración de complejidad sobre 10
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.print(" Dime valor de n? ");
		int n=entrada.nextInt();
		entrada.close();
		entrada=null;
		for (int i=1;i<=n;i++) {
			int blancos=n-i+1; // CAMBIO 1 (1/10): pongo +1
			for (int j=1;j<=blancos;j++)
				System.out.print('='); // CAMBIO 2 (1/10): = en vez b
			int asteriscos=2*i-1;
			for (int j=1;j<=asteriscos;j++)
				System.out.printf("%03d-",j*2); 
			    // CAMBIO 3 (2/10): Se muestra j en vez de *
			    // CAMBIO 4 (2/10): No aparece j sino 2*j
			    // CAMBIO 5 (1/10): la salida se formatea
			System.out.println();
		}
	}	
}
