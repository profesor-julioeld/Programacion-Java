package tema2;

import java.util.Scanner;
// Resolver el cálculo de la letra de un DNI
// Como ayuda explicar que hay una serie de métodos dinámicos
// que se pueden aplicar a una instancia de un String, entre ellos
// charAt()
// Buscar el artículo 11 del Real Decreto 1553/2005 que es donde
// indica cómo se calcula esa letra 
public class Punto2_letraNIF {

	public static void main(String[] args) {
		final String LETRAS="TRWAGMYFPDXBNJZSQVHLCKE";
		Scanner entrada=new Scanner(System.in);
		System.out.print("Escribe tu DNI sin la letra? ");
		int dni=entrada.nextInt();
		entrada.close();
		entrada=null;
		System.out.println("La letra es "+LETRAS.charAt(dni%23));
	}

}
