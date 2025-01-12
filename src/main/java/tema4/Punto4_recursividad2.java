package tema4;
// Sólo vamos a dar unas pequeñas pinceladas sobre recursividad
// un estudio profundo daría para meses, es una funcionalidad muy potente
// En esta ocasión implementamos la definición inductiva del factorial 
public class Punto4_recursividad2 {

	// Si devolvemos int sólo llegaremos a n=13
	// Devolviendo long llegamos a n=20
	// Plantéate cómo llegar a n=100 (son 158 dígitos)
	private static long sumatorio(int n) {
		// caso trivial
		if (n==0) return 0;
		else return sumatorio(n-1)+n;
	}
	
	public static void main(String[] args) {
		// Datos de entrada
		int n=5;
		// Procesamiento
		long res=sumatorio(n);
		System.out.printf("EL sumatorio de %d es %d \n",n,res);	
	}
	

}
