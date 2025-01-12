package tema4;
//Es el mismo ejercicio de igual número del punto 3 pero esta vez 
//resuelto bajo el paradigma procedimental 
public class Punto4_Ejercicio3Punto3 {

	private static void calculaPrimos(int n) {
		// Procesamiento
		for (int i=2;i<=n;i++) {
			// Miro si i es primo
			// uso técnica de bandera
			boolean primo=true;
			for (int j=2;j<i;j++) {
				if ((i-(i/j)*j)==0) {
					primo=false;
					break;
				}
			}
			if (primo) System.out.println(i);
		}
	}
	public static void main(String[] args) {
		// Datos para el proceso
		int numero=5;
		calculaPrimos(numero);
	}

}
