package tema5.ejerciciosFinales;

import java.util.Scanner;

public class Punto5_Ejercicio3 {
	private final static int MAX=3;
	public static void main(String[] args) {
		int cuadricula[][]=new int[MAX][MAX]; // Cuidado, índices de 0 a 2
	    carga(cuadricula);
		boolean solucion=false;
		solucion=comprueba(cuadricula);
		imprime(cuadricula);
		System.out.println((solucion?"Es":"No es")+" una solución");
	}
	
	private static void carga(int cuadricula[][]) {
		System.out.println(" Se pedirá los valores de 1 a 9 para las distintas posiciones");
		System.out.println(" En caso de no tener valor escriba un número diferente");
		Scanner entrada=new Scanner(System.in);
		for (int i=0;i<MAX;i++)
			for (int j=0;j<MAX;j++) {
				System.out.printf(" Dime posicion [%2d,%2d]? ",i+1,j+1);
				int leido=entrada.nextInt();
				leido=(leido>=1&&leido<=9)?leido:0;
				cuadricula[i][j]=leido;
			}
		entrada.close();
		entrada=null;
	}
	
	private static boolean comprueba(int cuadricula[][]) {
		// Para ser una solución tienen que estar los números de 1 a 9 
		// y no repetirse (no hace falta comprobar al haber 9 huecos)estan
		boolean estanTodos[]=new boolean[MAX*MAX]; 
		for (int[] fila:cuadricula)
			for (int valor:fila) {
				if (valor==0) return false;
				// EL valor 5 lo guardo en posición 4
		        estanTodos[valor-1]=true;
			}
		for (int i=0;i<MAX*MAX;i++)
			if (!estanTodos[i]) return false;
		return true;
	}
	
	private static void imprime(int cuadricula[][]) {
		for (int i=0;i<cuadricula.length;i++) {
			for (int j=0;j<cuadricula[i].length;j++)
				System.out.printf("[%1d]",cuadricula[i][j]);
			System.out.println();
		}
	}

}
