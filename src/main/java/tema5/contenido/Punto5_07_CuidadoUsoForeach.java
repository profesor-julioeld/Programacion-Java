package tema5.contenido;

import java.util.Arrays;

// Los recorridos con foreach son cómodos de codificar pero
// pueden dar lugar a errores lógicos inesperados
public class Punto5_07_CuidadoUsoForeach {
	private final static int MAX=5;
	public static void main(String[] args) {
		int valores[]= new int[MAX]; 
		System.out.println("Inicializado a "+Arrays.toString(valores));
		// CUIDADO: Con esta función no modificamos los valores del array
		// no funciona igual un foreach que un for que recorre el array
		Arrays.fill(valores,-1); // Ahora todos tienen -1
		sumoUnoForeach(valores);
		System.out.println("Con Foreach    "+Arrays.toString(valores));
		// Con esta función sí lo hacemos
		Arrays.fill(valores,-1); // Ahora todos tienen -1
		sumoUnoFor(valores);
		System.out.println("Con For normal "+Arrays.toString(valores));
	}
	
	private static void sumoUnoForeach(int a[]) {
		for (int valor:a) {
			valor++; // valor es una copia de lo que tiene esa posición
		}
	}
	
    private static void sumoUnoFor(int a[]) {
    	for (int i=0;i<a.length;i++)
    		a[i]++; // Accedo realmente a esa posición del array
	}
}
