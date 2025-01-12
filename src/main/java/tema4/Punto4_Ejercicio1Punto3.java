package tema4;
// Es el mismo ejercicio de igual número del punto 3 pero esta vez 
// resuelto bajo el paradigma procedimental 
public class Punto4_Ejercicio1Punto3 {

	public static void main(String[] args) {
		// Datos para el proceso
		int n=30;
		int base=8;
		System.out.println(binario(n,base));
	}
	
	private static String binario(int n, int base) {
		// Procesamiento
		int dividendo,divisor,cociente,resto;
		dividendo=n;
		divisor=base; 
		StringBuilder resultado=new StringBuilder();
		while (dividendo>=divisor) {
			cociente=dividendo/divisor;
			resto=dividendo-cociente*divisor;
			resultado.insert(0,resto);
			dividendo=cociente;
		}
		resultado.insert(0,dividendo);
		return resultado.toString();
	}

}
