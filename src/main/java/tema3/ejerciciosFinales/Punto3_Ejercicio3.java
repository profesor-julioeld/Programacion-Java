package tema3.ejerciciosFinales;
//Dado un valor n obtener los números primos hasta n
public class Punto3_Ejercicio3 {

	public static void main(String[] args) {
		// Datos para el proceso
		int numero=5;
		// Procesamiento
		for (int i=2;i<=numero;i++) {
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

}
