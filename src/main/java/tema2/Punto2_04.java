package tema2;
// Se introduce conceptos tan importantes como:
// - Aportaciones JEP (JDK Enhacement proposal), se va haciendo
//   aportaciones nuevas, lo importante es saber la versión
//   JDK en la que se pueden aplicar, para ello lo mejor es
//   leer los carteles de error que muestra el IDE
// - Compilar en una versión JDK específica
// - Código que puedo poner o no según JDK
import java.util.Scanner;

public class Punto2_04 {
	// Al escribir un número de 1 a 4 lo pone en texto
	// si ponemos uno de 5 a 8 pone "Te has pasado"
	// si es mucho mayor poner "Ya es el colmo"
	public static void main(String[] args) {
		// Switch clásico
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.print("Escribe un número de 1 a 4? ");
		a=sc.nextInt();
		sc.close();
		sc=null;
		// Resuelvo con switch de distintas formas
		// no todas hacen lo que queremos
		// NOTA: Antes de empezar tendríamos que comprobar
		// si el número es >=1 sino no seguir (con un if por ejemplo)
		if (a<1) {
			System.out.println(" Si no es >=1 no hacemos nada");
			System.exit(-1); // Corto ejecución del programa
		}
		// Desde JDK >=8 (es incluso anterior pero no compilamos por debajo de 8)
		System.out.println("CASO 1: Sin break");
		switch (a) {
			case 1:System.out.println("Uno");
			case 2:System.out.println("Dos");
			case 3:System.out.println("Tres");
			case 4:System.out.println("cuatro");
			case 5:
			case 6:
			case 7:
			case 8: System.out.println("Te has pasado");
			default: System.out.println("Ya es el colmo");
		}
		
		System.out.println("CASO 2: Con break");
		switch (a) {
			case 1:System.out.println("Uno");
				   System.out.println(" Estoy seguro que es el uno");
				   break;
			case 2:System.out.println("Dos");
			       break;
			case 3:System.out.println("Tres");break;
			case 4:System.out.println("cuatro");break;
			case 5:
			case 6:
			case 7:
			case 8: System.out.println("Te has pasado");break;
			default: System.out.println("Ya es el colmo");
		}
		// Sólo te deja usar casos agregados con JDK >= 14
		// Apartir de aquí usaremos JDK>=14 aunque algunas aportaciones
		// se incorporaron en JDK anteriores.
		System.out.println("CASO 3: Con break (casos agrupados)");
		switch (a) {
			case 1:System.out.println("Uno");break;
			case 2:System.out.println("Dos");break;
			case 3:System.out.println("Tres");break;
			case 4:System.out.println("cuatro");break;
			case 5,6,7,8:System.out.println("Te has pasado");break;
			default: System.out.println("Ya es el colmo");
		}
		// En este caso ya no hace falta los break, pero si quieres  
		// poner varias sentencias en el mismo caso, te toca poner {} 
		System.out.println("CASO 4: Con -> en vez :");
		switch (a) {
			case 1-> {System.out.println("Uno");a=a;}
			case 2-> System.out.println("Dos");
			case 3-> System.out.println("Tres");
			case 4-> System.out.println("cuatro");
			// Lo de poner varias etiquetas juntas >= JDK 14
			case 5,6,7,8-> System.out.println("Te has pasado");
			default-> System.out.println("Ya es el colmo");
		}
		
		// Aquí usamos expresiones switch
		// CUIDADO: A partir de JDK 13 se supone que no se debe usar break;
		System.out.println("CASO 5: Expresión switch en vez sentencia");
		String respuesta=switch (a) {
			case 1-> "Uno";
			case 2-> "Dos";
			case 3-> "Tres";
			case 4-> "cuatro";
			case 5,6,7,8-> "Te has pasado";
			default-> "Ya es el colmo";
		}; // EN este caso es necesario el ; para terminar la sentencia
		System.out.println(respuesta);	
		// Como podría contener varias sentencias cada caso
		// en JDK 14 se introduce el uso de yield
		System.out.println("CASO 6: Uso de yield");
		String respuesta2=switch (a) {
			case 1-> {a=a;yield "Uno";}
			case 2-> "Dos";
			case 3-> "Tres";
			case 4-> "cuatro";
			case 5,6,7,8-> "Te has pasado";
			default-> "Ya es el colmo";
		};
		System.out.println(respuesta2);
		// Si estás programando para backend, lo normal es que uses
		// un JDK 11, 17 o 21, cuidado con eso
		// RETO: Intenta compilar con la versión 8, 11 y 14
	}
}
