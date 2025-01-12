package tema1;

public class Punto1_13_03 {

	public static void main(String[] args) {
		// Cuidado al hacer comparaciones con decimales
		double c=1.0/10.0+2.0/10.0;
		c=c*10;
		boolean resultado=(c==3);
		System.out.println(resultado);
		// Para solucionarlo aplicaremos redondeos
		resultado=(Math.round(c)==3);
		System.out.println(resultado);
	}

}
