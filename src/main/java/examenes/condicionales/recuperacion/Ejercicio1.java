package examenes.condicionales.recuperacion;
import java.util.Scanner;
// Es una recuperación pero me niego a hacer un árbol de decisión
// para resolver este ejercicio cuando se resuelve muy fácil con un bucle
public class Ejercicio1 {
	private final static int MAX=4;
	public static void main(String[] args) {
		int resultado=0;
		Scanner entrada=new Scanner(System.in);
		System.out.println("Dime valores enteros? ");
		for (int i=0;i<MAX;i++) {
			int valor=entrada.nextInt();
			resultado+=valor%2==0?valor:-valor;
		}
		entrada.close();
		entrada=null;
		System.out.println("El resultado es "+resultado);
	}	
}
