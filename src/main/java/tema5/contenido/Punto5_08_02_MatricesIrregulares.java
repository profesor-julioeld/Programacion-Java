package tema5.contenido;

import java.util.Arrays;

// 2) Matrices irregulares:
//  En el anterior punto pudiste apreciar que una matriz es realmente
//  un array cuyo elementos son también arrays
//  Entendiendo que es así nos da un poco más de juego
public class Punto5_08_02_MatricesIrregulares {
	// 2) Matrices irregulares
	private final static int MAXF=3;
	public static void main(String[] args) {
		// Creo un array de 3 elementos
		// cada elemento es un array de enteros 
		// pero todavía no existe por lo que encontrarás 
		// null en cada elemento
		int matriz[][]=new int[MAXF][]; // Array de 3 filas de arrays
		// Contenido del array
		System.out.println(Arrays.toString(matriz));
		// Ahora vamos a asignar arrays de enteros de diferentes tamaños
		matriz[0]= new int[7];
		matriz[1]= new int[3];
		matriz[2]= new int[2];
		// Contenido del array
		System.out.println(Arrays.deepToString(matriz));
		// Recorrido con for
		// MI: Realmente es como deberíasmos hacerlo siempre
		for (int i=0;i<matriz.length;i++) {
			for (int j=0;j<matriz[i].length;j++)
				System.out.printf("matriz[%02d][%02d]=%02d ",i,j,matriz[i][j]);
			System.out.println();
		}
		// Podríamos haberlo inicializado de una forma más sencilla
		int matriz2[][]= {{1,2},{3},{1,2,3,4,5,6,7}};
		System.out.println(Arrays.deepToString(matriz2)); 
 	}
}
