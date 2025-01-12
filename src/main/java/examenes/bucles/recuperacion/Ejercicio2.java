package examenes.bucles.recuperacion;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.print("Escribe una cadena ? ");
		String cadena=entrada.nextLine();
		entrada.close();
		entrada=null;
		for (int i=0;i<cadena.length();) {
			// Primero viene una letra seguida de un dígito
			char carLetra=cadena.charAt(i++);
			char carDigito=cadena.charAt(i++);
			int repite=Character.getNumericValue(carDigito);
			for (int j=0;j<repite;j++)
				System.out.print(carLetra);
		}
		System.out.println();
	}	
}
