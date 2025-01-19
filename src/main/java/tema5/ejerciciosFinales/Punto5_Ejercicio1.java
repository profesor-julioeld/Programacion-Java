package tema5.ejerciciosFinales;

import java.util.Arrays;

public class Punto5_Ejercicio1 {
	/*
	 La siguiente función devuelve un nuevo array con los mismos valores
	 que inicio y un nuevo valor insertado en posicion (indice de 0 a n)
	 siendo n la longitud del array inicio
	 Si posicion no está entre 0 y n se devuelve inicio
	*/
    private static int[] insertaPosicion(int inicio[],int valor,int posicion) {
		int n=inicio.length;
		if (posicion<0 || posicion>n) return inicio;
		int paraDevolver[]=new int[n+1];
		// Copia desde 0 a posicion-1 
		System.arraycopy(inicio, 0, paraDevolver, 0, posicion);
		paraDevolver[posicion]=valor;
		// Copia desde posicion hasta n-1
		System.arraycopy(inicio, posicion, paraDevolver, posicion+1, n-posicion);
		return paraDevolver;
	}
	 
	// La siguiente función devuelve un nuevo array en el que insertaremos en orden
	// dentro de inicio valor. inicio tiene orden ascendente
	private static int[] insertaOrdenado(int inicio[],int valor) {
		int devuelve=Arrays.binarySearch(inicio,valor);
		// Si devuelve valor positivo es que lo ha encontrado
		// si es negativo, la posición de inserción se calcula como -posicion-1
		int puntoDeInsercion=devuelve>=0?devuelve:-devuelve-1;
		int resultado[]=insertaPosicion(inicio,valor,puntoDeInsercion);
		return resultado;
	}
	
	// Modifico un poco main para probar todos los casos
	public static void main(String[] args) {
		// Inserción por posición
		int valores[]= {1,10,2,4,-3};
		System.out.println("Array original          "+Arrays.toString(valores));
		for (int posicion=-1;posicion<=valores.length+1;posicion++) {
		  int resultado[]=insertaPosicion(valores,33,posicion);
	 	  System.out.printf("Insertado en posición %d %s\n",posicion,Arrays.toString(resultado));
		}
	 	// Inserción por valor
	 	int valores2[]= {1,2,3,5,6,7};
		System.out.println("Array original          "+Arrays.toString(valores2));
		// Pruebo la inserción de los números siguientes
		int numeros[]= {0,5,2,9,-1,4,6};
		for (int valor:numeros) {
			int resultado2[]=insertaOrdenado(valores2,valor);
			System.out.printf("Insertado valor %2d      %s\n",valor,Arrays.toString(resultado2));
	 	}
		// Si el array fuese grande, no estaría de mas asignar null a la variable tipo array
		// una vez dejemos de usarlo
	}
}
