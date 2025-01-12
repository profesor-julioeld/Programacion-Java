package tema5.contenido;
// Se pide la realización de este ejercicio en ejerciciosFinales (ejercicio 1)
import java.util.Arrays;

// La clase Array no dispone de un método específico para insertar un elemento
// la razón es sencilla ya que una estructura estática no es la mejor opción
// para hacer una inserción.
public class Punto5_07_08_Insercion_EJERCICIO {
	// Distinguiremos dos tipos de inserción:
	// CASO 1: Inserción de un valor en una posición concreta
	//  el array no tiene por qué estar ordenado
	//	Habrá que crear un nuevo array con un elemento más
	//	Por supuesto copiaremos los valores previos y posteriores al insertado
	
	// La siguiente función devuelve un nuevo array con los mismos valores
	// que inicio y un nuevo valor insertado en posicion (indice de 0 a n)
	// siendo n la longitud del array inicio
	// Si posicion no está entre 0 y n se devuelve inicio
	private static int[] insertaPosicion(int inicio[],int valor,int posicion) {
		int paraDevolver[]=new int[inicio.length+1];
		// Te toca programarlo a tí
		
		// Fin del algoritmo
		return paraDevolver;
	}
	
	// CASO 2: Inserción de un valor en un array ordenado.
	//  En este caso la posición tendremos que determinarla para que
	//  el array siga ordenado
	 
	// La siguiente función devuelve un nuevo array en el que insertaremos en orden
	// dentro de inicio valor. inicio tiene orden ascendente
	private static int[] insertaOrdenado(int inicio[],int valor) {
		int resultado[]=new int[inicio.length+1];
		// Te toca programarlo a tí
		return resultado;
	}
		
	public static void main(String[] args) {
		// Inserción por posición
		int valores[]= {1,10,2,4,-3};
		int resultado[]=insertaPosicion(valores,33,5);
	 	System.out.println("Ya insertado por posición "+Arrays.toString(resultado));
		// Inserción por valor
	 	int valores2[]= {1,2,3,5,6,7};
	 	int resultado2[]=insertaOrdenado(valores2,4);
	 	System.out.println("Ya insertado valor 4      "+Arrays.toString(resultado2));	 
	}
}
