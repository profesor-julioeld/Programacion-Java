package examenes.condicionales.recuperacion;
import java.util.Scanner;
// Es una recuperación pero me niego a hacer un árbol de decisión
// para resolver este ejercicio cuando se resuelve muy fácil con un bucle
public class Ejercicio1_hastaEOF {
	private final static int MAX=4;
	public static void main(String[] args) {
		// Hasta ahora no lo hemos visto pero qué pasaría si el número
		// de enteros a leer no estuviese determinado de antemano,
		// necesitaríamos una forma de decir que ya no hay más, eso se llama EOF
		// En windows se hace con ^Z, en linux con ^D
		// Si pruebas desde cmd ejecutando java examenes.recu....
		// funciona bien 
		// CUIDADO: Si Eclipse tiene el foco en el documento ^Z=deshacer
		// por ello tienes que hacer click en console antes de pulsar ^Z
		// si no funciona pulsas en otra ventana (ejem: Package Explorer) y después en console
		int resultado=0;
		Scanner entrada=new Scanner(System.in);
		System.out.println(" Dime valores enteros? ");
		while (entrada.hasNext()) {
			int valor=entrada.nextInt();
			resultado+=valor%2==0?valor:-valor;
		}
		System.out.println(" EL resultado es "+resultado);
	}	
}
