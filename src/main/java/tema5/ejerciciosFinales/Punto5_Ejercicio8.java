package tema5.ejerciciosFinales;
// Resuelve el ejercicio 8 
// Dado una matriz cuadrada de 4x4 rellena con números aleatorios del 1 al 9, 
// calcular la suma por filas y por columnas y mostrar todos esos datos en forma 
// de matriz 5x5  

public class Punto5_Ejercicio8 {
	private final static int MAX=5;
 	public static void main(String[] args) {
 		// Los datos los voy a grabar de la posición 0 a 3 para fila y columna
 		// en la fila 4 y columna 4 pondré las sumas
		int matriz[][]=new int[MAX][MAX];
		relleno(matriz);
		calculo(matriz);
		imprimo(matriz);
 	}
	
	private static void relleno(int[][] matriz) {
		for (int i=0;i<MAX-1;i++)
			for (int j=0;j<MAX-1;j++) {
				int M=1;
				int N=9;
				int valorEntero = (int) (Math.floor(Math.random()*(N-M+1)+M));
				//System.out.println(valorEntero);
				matriz[i][j]=valorEntero;
			}				
	}
	
	private static void calculo(int[][] matriz) {
		int total=0;
		int i=0,j=0;
		for (i=0;i<MAX-1;i++) {
			int sumaF=0,sumaC=0;
			for (j=0;j<MAX-1;j++) {
				sumaF+=matriz[i][j];
				sumaC+=matriz[j][i];
			}
			matriz[i][j]=sumaF;
			matriz[j][i]=sumaC;
			total+=sumaF;
		}
		matriz[i][j]=total;
	}
	
	private static void imprimo(int[][] matriz) {
		for (int i=0;i<MAX;i++) {
			for (int j=0;j<MAX;j++) {
				System.out.printf("%3d",matriz[i][j]);
			}
			System.out.println();
		}
	}
	
}