package tools;
// La creación de números aleatorios es muy importante 
// en informática, si tienes curiosidad mira para qué usan
// las 100 lámparas de lava CloudFare
// Veamos varias formas de obtenerlos, en este caso usamos Math.random
// ten en cuenta que realmente son pseudoaletorios
// parte de una semilla y si la repites lo más seguro es
// que obtengas el mismo número
public class NumerosAleatoriosConMath {
	public static void main(String[] args) {
		// Uso de Math.random
		double aleDouble=Math.random(); // Genera de [0.0,1.0)
		System.out.println("Aleatorio [0.0,1.0) "+aleDouble);
		// Si quieres de 0 a 10 multiplico por 10
		aleDouble=aleDouble*10;
		System.out.println("Aleatorio [0.0,10.0) "+aleDouble);
		// Aproxima al valor sin decimales hacia abajo
		aleDouble=Math.floor(aleDouble);
		System.out.println("Sin decimales pero double "+aleDouble);
		// MI: Hay un fichero que te explica el uso de floor
		// Lo paso a entero
		int aleInt=(int)aleDouble;
		System.out.println("Entero sin decimales "+aleInt); 
		// Si sumas 1 obtienes [1,10]
		aleInt=aleInt+1;
		System.out.println("Aleatorio [1,10] "+aleInt);
		// Si le das un poco al coco puedes llegar a la 
		// siguiente fórmula para obtener [M,N]
		int M=4;
		int N=35;
		int valorEntero = (int) (Math.floor(Math.random()*(N-M+1)+M));
		System.out.println("Aleatorio [4,35] "+valorEntero);
	}

}
