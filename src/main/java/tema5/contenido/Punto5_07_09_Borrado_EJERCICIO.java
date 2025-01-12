package tema5.contenido;
//Se pide la realización de este ejercicio en ejerciciosFinales (ejercicio 2)
import java.util.Arrays;

// La clase Array no dispone de un método específico para borrar un elemento
// la razón es sencilla ya que una estructura estática no es la mejor opción
// para hacer un borrado.
public class Punto5_07_09_Borrado_EJERCICIO {
	// Distinguiremos de borrados:
	// CASO 1: Borrar un elemento en una posición concreta.
	//  El nuevo array tendrá un elemento menos
	 
	// La siguiente función devuelve un nuevo array en el que se ha borrado
	// el elemento en posicion (de 0 a n-1)
	private static int[] borradoPosicion(int inicio[],int posicion) {
		int resultado[]=new int[inicio.length-1];
		// Te toca programarlo a tí
		return resultado;
	}
	
	// CASO 2: Borrar la primera ocurrencia de valor en inicio.
	//  para mejorar la eficiencia de la función, inicio estará ordenado ascendente
	
	// La siguiente función devuelve un nuevo array en el que se ha borrado
	// valor (la primera ocurrencia) 
	private static int[] borradoValor(int inicio[],int valor) {
		int resultado[]=new int[inicio.length-1];
		// Te toca programarlo a tí
		return resultado;
	}
	
	// Idem que la anterior pero todas las ocurrencias
	private static int[] borradoValorTodos(int inicio[],int valor) {
		int resultado[]=new int[inicio.length+1];
		// Te toca programarlo a tí
		return resultado;
	}
	
	public static void main(String[] args) {
		// Array no ordenado
		int valores[]= {1,10,2,4,-3};
		int resultado[]=borradoPosicion(valores,0);
	 	System.out.println("Ya borrado posicion 0  "+Arrays.toString(resultado));
		// Array ordenado
	 	int valores2[]= {1,2,3,5,6,7};
	 	int resultado2[]=borradoValor(valores2,3);
	 	System.out.println("Ya borrado valor 3     "+Arrays.toString(resultado2));	 
	}
}
