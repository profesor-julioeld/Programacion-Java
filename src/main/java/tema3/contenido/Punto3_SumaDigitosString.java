package tema3.contenido;
import java.util.Scanner;
// Leemes una cadena de digitos por teclado
// tenemos que devolver la suma de los dígitos
// y mostrar error si algún carácter no es dígito
public class Punto3_SumaDigitosString {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.print("Escribe una cadena ? ");
		String cadena=entrada.nextLine();
		entrada.close();
		entrada=null;
		int suma=0;
		for (int i=0;i<cadena.length();i++) {
			char car=cadena.charAt(i);
			if (Character.isDigit(car)) {
				suma+=Character.getNumericValue(car); 
			}
			else {
				System.err.println(" Solo se admiten dígitos ");
				System.exit(-1);
			}
		}
		System.out.println(suma);
	}	
}
