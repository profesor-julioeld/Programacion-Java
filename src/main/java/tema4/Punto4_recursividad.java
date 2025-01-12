package tema4;
// Sólo vamos a dar unas pequeñas pinceladas sobre recursividad
// un estudio profundo daría para meses, es una funcionalidad muy potente
// En esta ocasión implementamos la definición inductiva del factorial 
public class Punto4_recursividad {

	// Si devolvemos int sólo llegaremos a n=13
	// Devolviendo long llegamos a n=20
	// Plantéate cómo llegar a n=100 (son 158 dígitos)
	private static long factorial(int n) {
		// caso trivial
		if (n==0) return 1;
		else return n*factorial(n-1);
	}
	
	public static void main(String[] args) {
		// Datos de entrada
		int n=5;
		// Procesamiento
		long res=factorial(n);
		System.out.printf("EL factorial de %d es %d \n",n,res);	
	}
}
// Ya hemos visto un poco de funciones y podemos introducir
// los conceptos de Heap y Stack como espacios de memoria usados por JVM
//    Heap - Es el espacio de almacenamiento global de los objetos
//    Stack - Es el espacio donde almacenamos las variables locales 
// Explicar en clase cómo se conectan Stack y Heap
// y Call stack dentro del Stack (LIFO)
