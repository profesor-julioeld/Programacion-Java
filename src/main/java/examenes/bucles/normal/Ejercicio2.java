package examenes.bucles.normal;
import java.util.Scanner;
//Para poder analizar la complejidad del ejercicio
//deberás compararlo con Punto3_SumaDigitosString
//Se ha documentado las modificaciones respecto el primer código.
//Entre paréntesis aparece una valoración de complejidad sobre 10
public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.print("Escribe una cadena ? ");
		String cadena=entrada.nextLine();
		entrada.close();
		entrada=null;
		for (int i=0;i<cadena.length();i++) {
			char car=cadena.charAt(i);
			if (Character.isDigit(car)) {
				// CAMBIO 1 (3/10) : En vez sumar compruebo si es par
				//           si lo es, escribo un valor, sino otro
				boolean espar=Character.getNumericValue(car)%2==0;
				System.out.print(espar?"<ESPAR>":"<ESIMPAR>");
			}
			else System.out.print(car); // CAMBIO 2 (2/10) : No escribo error sino el car
		}
	}	
}
