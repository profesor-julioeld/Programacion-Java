package tema4;
//Es el mismo ejercicio de igual número del punto 3 pero esta vez 
//resuelto bajo el paradigma procedimental 
public class Punto4_Ejercicio2Punto3 {

	public static void main(String[] args) {
		// Datos para el proceso
		String numero="110";
		int base=2;
		int resultado=invertir(numero, base);
		System.out.println(resultado);
	}
	
	private static int invertir(String numero, int base) {
		// Procesamiento
		int resultado=0;
		int potencia=1;
		for (int i=numero.length()-1;i>=0;i--) {
			int digito=numero.charAt(i);
			resultado+=Character.getNumericValue(digito)*potencia;
			potencia*=base;
		}
		return resultado;
	}

}
