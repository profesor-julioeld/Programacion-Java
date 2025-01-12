package tema1;

public class Punto1_13_02 {
	public static void main(String[] args) {
		int a,b;
		a=1;
		b=a++; // Postincremento
		System.out.println("Valor de a "+a);
		System.out.println("Valor de b "+b);
		a=1;
		b=++a; // Preincremento
		System.out.println("Valor de a "+a);
		System.out.println("Valor de b "+b);
		// Problemas con la precisión de los cálculos
		// Ponemos 10.0 en vez de 10 para que calcule con decimales
		double c=1.0/10.0+2.0/10.0;
		c=c*10;
		System.out.println(c); // No muestra exactamente 3
		// Otra versión que te puede dejar perplejo
		double d=1/10+2/10; // Todas las operaciones las hace sin decimales
		d=d*10;
		System.out.println(d);
	}
}
