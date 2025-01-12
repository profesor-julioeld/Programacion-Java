package tools;
// System.out.prinf permite escribir con un formato
public class UsoPrintf {

	public static void main(String[] args) {
		// Veamos algunos casos interesantes
		// En todos primeros ponemos un String indicando
		// el formato y en qué posiciones pondremos los argumentos
		// y con qué formato ejem: %02d
		// Puedes aprender más al respecto desde
		// https://www.w3schools.com/java/ref_output_printf.asp
		//System.out.printf("Hola\n");
		//System.out.printf("Hola%n");
		String s="pepe";
		//System.out.printf("Hola %s",s);
		Double d=2.3456;
		//System.out.printf(" Valor %.1f",d);
		System.out.printf("[%04d,\n%4d]",3,666);
		// Sigue poniendo casos
	}
}
