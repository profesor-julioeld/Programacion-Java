package tema5.contenido;
// Los arrays son objetos de una clase especial
// son una secuencia de elementos del mismo tipo (primitivo o referencia de objeto)
// obviamente son objetos mutables
// --- Analizar paralelismo de String con array de char
public class Punto5_04_02_DefiniciónArrays {

	public static void main(String[] args) {
		// Dos formas de definir el array
		// ahora mismo no referencias a ningún array
		int a1[];
		int[] a2; // Esto es más formato del lenguaje C
		// Ahora toca crear el array (el objeto) y asignar la referencia
		a1=new int[4];
		a2=new int[15];
		// Los distintos int se inicializan a 0, según tipo tiene una inicialización
		// Fíjate cómo para saber la length se usa atributo y no método
		for (int i=0;i<a1.length;i++)
			System.out.printf("Índice %d valor %d\n",i,a1[i]);
		// Si imprimes a1 obtienes algo parecido a la referencia
		System.out.println(a1);
		// Para leer o asignar un elemento concreto usamos el índice
		a1[2]=-100;
		System.out.println("El valor de a1[2] es "+a1[2]);
		// Puedes definir referencia y crear objeto array al mismo tiempo
		int a3[]= {1,2,3,4};
		// Pero no se puede hacer separado
		// El código siguiente da error si lo descomprimes.
		/*int a4[];
		a4= {1,2,3,4};*/
		// Esto es un foreach 
		for (int valor:a3)
			System.out.println(" Valor "+valor);
		// Si usamos un índice fuera de rango da error
		for (int i=0;i<15;i++)
			System.out.printf("Índice %d valor %d\n",i,a3[i]);
		// Avisamos al gc que recupere el espacio ocupado en el Heap
		// imagina que el objeto ocupase mucho espacio y ya no lo necesitas
		// cuanto antes asignes a null mejor
		a1=null;
		a2=null;
		a3=null;
		
	}

}
