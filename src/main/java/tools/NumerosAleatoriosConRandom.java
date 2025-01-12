package tools;

import java.util.Random;

// Veamos varias formas de obtenerlos, en este caso usamos Random
public class NumerosAleatoriosConRandom {
	public static void main(String[] args) {
		// Uso de la clase Random
		// Con esta clase sí se le puede pasar la semilla
		// en esta ocasión dejamos que la escoja él
		Random r = new Random(); // Sólo se pone una vez
		int aleatorio = r.nextInt(10)+1; 
		System.out.println("Aleatorio [1,10] "+aleatorio);
		// Una fórmula general para rango [M,N] sería
		int M=4;
		int N=35;
		int aleatorio2 = r.nextInt(N-M+1)+M; 
		System.out.println("Aleatorio [4,35] "+aleatorio);
	}

}
