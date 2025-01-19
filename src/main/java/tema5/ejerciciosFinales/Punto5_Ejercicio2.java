package tema5.ejerciciosFinales;

import java.util.Arrays;

public class Punto5_Ejercicio2 {
	
	// La siguiente función devuelve un nuevo array en el que se ha borrado
	// el elemento en posicion (de 0 a n-1) para otro valor devuelve inicio
	private static int[] borradoPosicion(int inicio[],int posicion) {
		int n=inicio.length;
		if (posicion<0 || posicion>n-1) return inicio;
		int paraDevolver[]=new int[n-1];
		// Copia desde 0 a posicion-1 
		System.arraycopy(inicio, 0, paraDevolver, 0, posicion);
		// Copia desde posicion+1 hasta n-1
		System.arraycopy(inicio, posicion+1, paraDevolver, posicion, n-posicion-1);
		return paraDevolver;
	}
	
	// La siguiente función devuelve un nuevo array en el que se ha borrado
	// valor (la primera ocurrencia)
	// Si no se encuentra valor, devuelve el mismo array
	private static int[] borradoValor(int inicio[],int valor) {
		int devuelve=Arrays.binarySearch(inicio,valor);
		// Si devuelve valor positivo es que lo ha encontrado
		// si es negativo, la posición de inserción se calcula como -posicion-1
		if (devuelve<0) return inicio;
		int posicionDeBorrado=devuelve;
		int resultado[]=borradoPosicion(inicio,posicionDeBorrado);
		return resultado;
	}
	
	// Idem que la anterior pero todas las ocurrencias
	private static int[] borradoValorTodos(int inicio[],int valor) {
		// Voy a borrar valor hasta que ya no éste
		// es poco eficiente pero fácil de codificar
		int resultado[]=null;
		do {
		  resultado=borradoValor(inicio,valor);
		  if (resultado==inicio) return inicio;
		  inicio=resultado;
		} while (true);
	}
	
	public static void main(String[] args) {
		// Borrado por posición
		int valores[]= {1,10,2,4,-3};
		System.out.println("Array original         "+Arrays.toString(valores));
		for (int posicion=-1;posicion<=valores.length;posicion++) {
		  int resultado[]=borradoPosicion(valores,posicion);
	 	  System.out.printf("Borrado de posición %2d %s\n",posicion,Arrays.toString(resultado));
		}
		
		// Borrado por valor
	 	int valores2[]= {1,2,3,5,5,7};
		System.out.println("Array original         "+Arrays.toString(valores2));
		// Pruebo el borrado de los número siguientes
		int numeros2[]= {0,5,2,9,-1,4};
		for (int valor:numeros2) {
			int resultado2[]=borradoValor(valores2,valor);
			System.out.printf("Borrado valor %2d       %s\n",valor,Arrays.toString(resultado2));
	 	}
		
		// Borrado por valor
	 	int valores3[]= {1,2,3,5,5,5,7};
		System.out.println("Array original         "+Arrays.toString(valores3));
		// Pruebo el borrado de los número siguientes
		int numeros3[]= {0,5,2,9,-1,4};
		for (int valor:numeros3) {
			int resultado3[]=borradoValorTodos(valores3,valor);
			System.out.printf("Borrado valor Todos %2d       %s\n",valor,Arrays.toString(resultado3));
	 	}
	}
}
