package examenes.condicionales.recuperacion;
import java.util.Scanner;
// Es una recuperación pero me niego a hacer un árbol de decisión
// Si usas bucle y arrays te saldrá de fábula
// Ni miréis la solución de Iván y la de Pedro ni te digo
public class Ejercicio2 {
	private final static int MAX=4;
	private final static int clave[]= {50,20,30,10};
	public static void main(String[] args) {
		boolean coincide=true; // Método bandera
		Scanner entrada=new Scanner(System.in);
		System.out.println("Dime valores enteros? ");
		for (int i=0;i<MAX;i++) {
			int valor=entrada.nextInt();
			if (clave[i]!=valor) {
				// Si pongo break no lee los 4
				coincide=false;
			}
		}
		entrada.close();
		entrada=null;
		if (coincide) System.out.println("Has acertado");
		else System.out.println("No has acertado");
	}	
}
