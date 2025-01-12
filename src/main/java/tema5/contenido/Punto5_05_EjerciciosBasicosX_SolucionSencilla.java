package tema5.contenido;
//Solución sencilla para los ejercicos básicos del 1 al 3
// Muchas veces no consiste en diseñar un algoritmo maravilloso sino
// en hacer la mejor elección de las estructuras de datos a usar
// En esta ocasión puedes ver cómo se simplifica la codificación 
public class Punto5_05_EjerciciosBasicosX_SolucionSencilla {
	final static int MAX=5; // 5 números aleatorios en total
	final static int COMBMAX=49; // número más alto permitido
	public static void main(String[] args) {
		// Ejercicio 1, 2 y 3
		boolean aleatorios[]=new boolean[COMBMAX];
		for (int i=0;i<MAX;i++) {
			int valor;
			do {
				valor=obtenAleatorio(1,COMBMAX);
			} while (aleatorios[valor-1]);
		    aleatorios[valor-1]=true;
		}
		for (int i=0;i<COMBMAX;i++)
			if (aleatorios[i]) System.out.println(i+1);
	}
	
	
	public static int obtenAleatorio(int ini,int fin) {
		int M=ini;
		int N=fin;
		int valorEntero = (int) (Math.floor(Math.random()*(N-M+1)+M));
		return valorEntero;
	}
	
}
