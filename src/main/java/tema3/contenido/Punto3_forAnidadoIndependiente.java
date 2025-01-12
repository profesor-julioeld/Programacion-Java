package tema3.contenido;
// Toca ver bucles anidados, en esta ocasión independientes
// Veamos un bucle clásico para recorrer filas y columnas
public class Punto3_forAnidadoIndependiente {

	public static void main(String[] args) {
		int MAXF=5;
		int MAXC=6;
		for (int i=1;i<=MAXF;i++)
			for (int j=1;j<=MAXC;j++)
				System.out.println("["+i+","+j+"]");
		// Vamos ahora a pintar la matriz 
		for (int i=1;i<=MAXF;i++) {
			for (int j=1;j<=MAXC;j++)
				System.out.print("["+i+","+j+"]");
			System.out.println();
		}
		// Si aumentamos más de 10 empieza a salir feo
		MAXF=13;
		MAXC=12;
		for (int i=1;i<=MAXF;i++) {
			for (int j=1;j<=MAXC;j++)
				System.out.print("["+i+","+j+"]");
			System.out.println();
		}
		// Pero todo tiene solución
		MAXF=13;
		MAXC=12;
		for (int i=1;i<=MAXF;i++) {
			for (int j=1;j<=MAXC;j++)
				System.out.printf("[%2d,%2d]",i,j);
			// Y si pones 02d todavía mejor
			System.out.println();
		}
	}

}
