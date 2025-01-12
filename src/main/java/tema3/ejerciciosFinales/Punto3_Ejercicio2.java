package tema3.ejerciciosFinales;
//Dado un String que representa un número en una base dada
//calcular su valor decimal 
public class Punto3_Ejercicio2 {

	public static void main(String[] args) {
		// Datos para el proceso
		String numero="110";
		int base=2;
		// Procesamiento
		int resultado=0;
		int potencia=1;
		for (int i=numero.length()-1;i>=0;i--) {
			int digito=numero.charAt(i);
			resultado+=Character.getNumericValue(digito)*potencia;
			potencia*=base;
		}
		System.out.println(resultado);
	}
}
