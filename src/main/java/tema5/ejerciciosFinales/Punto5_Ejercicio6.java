package tema5.ejerciciosFinales;
import java.util.Arrays;
// Resuelve el ejercicio 6 en el que programamos el juego de las tres en raya 
// pero ni con gráficos ni con Programación dirigida a eventos
import java.util.Scanner;

public class Punto5_Ejercicio6 {
	private final static int MAX=3;
	private final static char X='X';
	private final static char O='O';
	private final static char VACIO=' ';
	public static void main(String[] args) {
		char cuadricula[][]=new char[MAX][MAX]; // Cuidado, índices de 0 a 2
		// Inicio con espacios en blanco cada cuadrícula
		boolean vhayHuecos,vganador;
		int i,j;
		poneHuecos(cuadricula);
		Scanner entrada=new Scanner(System.in);
		char turno=X;
	    do {
	    	imprime(cuadricula);
	    	turno=turno==X?O:X; // Cambio de turno
	    	do {
	    		System.out.printf(" Dime fila/columna (de 1 a 3) para la %c ",turno);
	    		// <<<< Ahora mismo no hago control de errores
	    		i=entrada.nextInt()-1;
	    		j=entrada.nextInt()-1;
	    	} while (cuadricula[i][j]!=VACIO);
	    	cuadricula[i][j]=turno;
	    	vhayHuecos=hayHuecos(cuadricula);
	    	vganador=ganador(cuadricula,turno);
	    } while (vhayHuecos && ! vganador);
	    imprime(cuadricula);
	    entrada.close();
	    entrada=null;
	    if (vganador) System.out.println(" Ganador "+turno);
	    else 
	    	if (vhayHuecos) System.out.println(" Tablas ");
	}
	
	// Devuelve true si hay tres elementos valor (será 'X' o 'O')
	// iguales, en filas o columnas o diagonales
	private static boolean ganador(char c[][],char valor) {
		// Solución hardcodeada , busca otra opción para n.
		return (c[0][0]==valor && c[0][0]==c[0][1] && c[0][1]==c[0][2]) ||
			   (c[1][0]==valor && c[1][0]==c[1][1] && c[1][1]==c[1][2]) ||
			   (c[2][0]==valor && c[2][0]==c[2][1] && c[2][1]==c[2][2]) ||
			   (c[0][0]==valor && c[0][0]==c[1][0] && c[1][0]==c[2][0]) ||
			   (c[0][1]==valor && c[0][1]==c[1][1] && c[1][1]==c[2][1]) ||
			   (c[0][2]==valor && c[0][2]==c[1][2] && c[1][2]==c[2][2]) ||
			   (c[0][0]==valor && c[0][0]==c[1][1] && c[1][1]==c[2][2]) ||
			   (c[0][2]==valor && c[0][2]==c[1][1] && c[1][1]==c[2][0]); 
	} 
	
	// Devuelve true si hay algún hueco
	private static boolean hayHuecos(char[][] c) {
		for (char[] fila:c)
			for (char valor:fila) 
				if (valor==VACIO) {
					return true;
				}
		return true;
	}
	
	private static void imprime(char cuadricula[][]) {
		// Escribe primera línea sobre plantilla 1[ ][ ][ ]
		System.out.println("  1  2  3");
		for (int i=0;i<cuadricula.length;i++) {
			System.out.print(i+1);
			for (int j=0;j<cuadricula[i].length;j++)
				System.out.printf("[%c]",cuadricula[i][j]);
			System.out.println();
		}
	}
	
	// Los huecos los codifico como caracteres en blanco
	private static void poneHuecos(char cuadricula[][]) {
		for (int i=0;i<cuadricula.length;i++)
			for (int j=0;j<cuadricula[i].length;j++)
				cuadricula[i][j]=VACIO;
	}
	
 }
