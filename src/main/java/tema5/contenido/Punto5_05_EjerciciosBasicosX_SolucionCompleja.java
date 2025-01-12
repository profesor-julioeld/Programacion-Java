package tema5.contenido;
// Solución compleja para los ejercicos básicos del 1 al 3
public class Punto5_05_EjerciciosBasicosX_SolucionCompleja {
	final static int MAX=5;
	public static void main(String[] args) {
		// Ejercicio 1
		int aleatorios[]=new int[MAX];
		for (int i=0;i<aleatorios.length;i++)
			aleatorios[i]=obtenAleatorio(1,49);
		for (int i=0;i<aleatorios.length;i++)
			System.out.printf("(EJ1) Índice %d valor %d\n",i,aleatorios[i]);
		// Ejercicio 2
		for (int i=0;i<MAX;i++) {
			int alea;
			boolean norepito;
			do {
			  alea=obtenAleatorio(1,49);
			  norepito=true;
			  for (int j=0;j<i;j++)
				  if (aleatorios[j]==alea) {
					  norepito=false;
					  break;
				  }
			} while(!norepito);
			aleatorios[i]=alea;
		}
		for (int i=0;i<MAX;i++)
			System.out.printf("(EJ2) Índice %d valor %d\n",i,aleatorios[i]);
		// Ejercicio 3
		// Tan sólo tenemos que conseguir ordenar el array
		// ya tenemos métodos que se pueden encargar de ello pero
		// vamos a usar un algoritmo para hacerlo
		ordenar(aleatorios);
		for (int i=0;i<MAX;i++)
			System.out.printf("(EJ3) Índice %d valor %d\n",i,aleatorios[i]);
		// Hay una forma chachi de hacer esto mismo pero con un forech
		// ya es programación mucho más avanzado
		for (int i:aleatorios) {
			System.out.println("valor obtenido con foreach "+i);
		}
	}
	
	public static int obtenAleatorio(int ini,int fin) {
		int M=ini;
		int N=fin;
		int valorEntero = (int) (Math.floor(Math.random()*(N-M+1)+M));
		return valorEntero;
	}
	
	// Aquí puedes ver cómo a pesar de pasar por valor el array (la referencia)
	// al ser un objeto mutable, podemos cambiar su contenido
	// NOTA: Esta forma de ordenar es horrible pero sencilla de implementar
	// puedes evitar muchos intercambios si lo piensas un poco
	// aún así la complejidad sería O(n2)
	// Echa un vistazo a la wiki para ver una clasificación de algoritmos de ordenación
	// https://es.wikipedia.org/wiki/Algoritmo_de_ordenamiento
	public static void ordenar(int a[]) {
		for (int i=0;i<a.length;i++) {
			// Supongo que a[i] es el menor
			// Si encuentro otro menor intercambio valores
			for (int j=i+1;j<a.length;j++)
				if (a[j]<a[i]) {
					int aux=a[j];
					a[j]=a[i];
					a[i]=aux;
				}
		}
		
	}
}
