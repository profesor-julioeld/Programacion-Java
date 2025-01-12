package tema5.contenido;

import java.util.Arrays;

// Los array no son de clase Arrays 
// La clase Arrays se creó para facilitar su uso (como Math para operaciones)
// veremos algunos ejemplos de uso, hay muchos más
public class Punto5_07_01_ClaseArrays {
	private final static int MAX=5;
	public static void main(String[] args) {
		int valores[]= new int[MAX]; //Inicializados a 0
		// USOS: Relleno array y paso a String
		System.out.println("Inicializado a  "+Arrays.toString(valores));
		Arrays.fill(valores,-1); // Ahora todos tienen -1
		System.out.println("Relleno ahora a "+Arrays.toString(valores));
		
		// USOS: Ordenación del array usando algoritmo eficiente 
		// parallelsort hace lo mismo pero usando estrategia distribuida
		// Busca Arrays.sort y por tanto DualPivotQuicksort.java en java.util para ver código 
		int valores2[]= {3,7,-12,56,8};
		Arrays.sort(valores2);
		System.out.println("Array ordenado "+Arrays.toString(valores2));
		
		// USOS: Búsqueda de un valor en un array con búsqueda binaria
		// Explicar diferencia entre búsqueda:
		//   - En array no ordenado
		//   - En array ordenado y como variante la búsqueda binaria
		// MI: El array debe estar ordenado
		// Tienen sobrecarga, estudiar diferentes usos
		int posicion=Arrays.binarySearch(valores2, -12);
		System.out.printf("Encontrado en la posición %d \n",posicion);
		posicion=Arrays.binarySearch(valores2, 12);
		System.out.printf("Encontrado en la posición %d \n",posicion);
		
		// USOS: Copia, veremos dos tipos de copia
		// Copia generando un nuevo array
		// Copia de una array a otro existente
		// Tienen sobrecarga, estudiar diferentes usos
		//  El array valores3 no está creado previamente
		int valores3[]=Arrays.copyOf(valores2, MAX); 
		System.out.println("Array copiado con copyOf    "+Arrays.toString(valores3));
		Arrays.fill(valores3,0);
		//  El array valores3 debe estar creado previamente
		System.arraycopy(valores2, 0, valores3,0,MAX);
		System.out.println("Array copiado con arraycopy "+Arrays.toString(valores3));
		
		// USOS: Comparar arrays (valores2 vs valores3)
		// Para que las dos tablas sean iguales lo primero es que tengan la misma dimensión
		// sólo tocará comparar elemento a elemento.
		// Probaremos varias funciones:
		//   - comparar directamente los arrays (no funciona)
		//   - equals de Object (no funciona)
		//   - mismatch de Arrays (funciona)
		//   - equals de Arrays (funciona, llama a mismatch, mira el código)
		//   - compare de Arrays (funciona, llama a mismatch)
		// Supongo que ya entenderás que así no se comparan
		System.out.println("Comparaciones");
		String s="Hola";
		String s2="Hola";
		if (s==s2) System.out.println(" son iguales s y s2");
		if (valores2==valores3) 
			System.out.println("Cierto valores2==valores3");
		// Esta forma de comparar funcionará si la clase en cuestión
		// ha sobreescrito (override) el método equals heredado de Object
		// Los arrays no lo hacen (pero String sí)
		// Lo puedes ver fácilmente en la ayuda contextual
		if (valores2.equals(valores3))
			System.out.println("Cierto valores2.equals(valores3)");
		if (Arrays.mismatch(valores2,valores3)==-1)
			System.out.println("Cierto Arrays.mismatch(valores2,valores3)==-1");
		if (Arrays.equals(valores2,valores3))
			System.out.println("Cierto Arrays.equals(valores2,valores3)");
		if (Arrays.compare(valores2,valores3)==0)
			System.out.println("Cierto Arrays.compare(valores2,valores3)==0");
	}
}
