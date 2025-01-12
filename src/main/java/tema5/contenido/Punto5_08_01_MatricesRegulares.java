package tema5.contenido;

import java.util.Arrays;

// Hasta ahora hemos visto arrays de tipos primitivos o incluso de objetos
// como String.
// En muchas ocasiones necesitaremos crear de datos del mismo tipo* pero con varias
// dimensiones, cuando tienen mas de dos se denominan matrices, hay de varios tipos:
//  1) Matrices regulares: Si se puede pintar como un rectángulo 
//    todas las filas con igual longitud
//  2) Matrices irregulares: Cada fila puede tener una dimensión diferente
public class Punto5_08_01_MatricesRegulares {
	// 1) Uso matrices regulares
	private final static int MAXF=3;
	private final static int MAXC=5;
	public static void main(String[] args) {
		// Aunque se pueden crear matrices de mas de dos dimensiones 
		// nos vamos a centrar en las más usuales que son las bisimensionales
		int matriz[][]=new int[MAXF][MAXC]; // 3 filas de 5 columnas cada una
		int matriz2[][]= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
		// Para mostrar contenido
		System.out.println("Recorrido con for normal");
		for (int i=0;i<MAXF;i++) {
			for (int j=0;j<MAXC;j++) 
				System.out.printf("matriz2[%02d][%02d]=%02d ",i,j,matriz2[i][j]);
			System.out.println();	 
		}
		// Aquí puedes apreciar que realmente un array de arrays
		System.out.println("Uso función toString");
		System.out.println(Arrays.toString(matriz2));
		System.out.println("Recorrido con foreach");
		int i=0;
		for (int[] array:matriz2) {
			int j=0;
			for (int valor:array)
				System.out.printf("matriz2[%02d][%02d]=%02d ",i,j++,valor);
			i++;
			System.out.println();
		}
			
		// Puedo usar otra función de Array para que vaya
		// recorriendo de forma recursiva y en profundidad
		System.out.println("Función Arrays.deepToString");
		System.out.println(Arrays.deepToString(matriz2));
 	}
}
