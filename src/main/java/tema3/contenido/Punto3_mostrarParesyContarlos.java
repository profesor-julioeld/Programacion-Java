package tema3.contenido;

public class Punto3_mostrarParesyContarlos {

	public static void main(String[] args) {
		// Tengo que cambiar a 1000 antes de entregar
		final int LIMITE=10;
		int i=1;
		int cuantos=0; 
		// Si lo implemento con while de Java
		while (i<=LIMITE) {
			if (i%2==0) {
				cuantos++;
				System.out.println(i+" es par");
			}
			i++;
		}
		System.out.println("Hay "+cuantos+" pares");
		// Si lo implemento con for de Java
		cuantos=0;
		for (int j=1;j<=LIMITE;j++) 
			if (j%2==0) {
				cuantos++;
				System.out.println(j+" es par");
			}
		System.out.println("Hay "+cuantos+" pares");
	}

}
