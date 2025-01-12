package tools;
// El uso de la clase String, aunque sencillo, es ineficiente si 
// intentamos modificar su contenido ya que crea objetos inmutables
// quiere decir que si una variable contiene una referencia a una cadena
// ésta no se puede modificar, sólo sustituir por otra
// Veremos la opción eficiente de hacer esas modificaciones
// 
// Disponemos de dos opciones de String que crean objetos mutables
//  StringBuilder - Más eficiente pero no Thread Safe
//  StringBuffer  - Menos eficiente pero Thread Safe
//  Ahora mismo usaremos la primera opción pero en segundo verás que te interesa la segunda
// Estas clases tienen además métodos muy interesantes
public class StringBuidervsStringBuffer {

	public static void main(String[] args) {
		// Con String se desaprovechan muchos objetos en este programa
		String cadena="";
		for (int i=0;i<1000;i++)
			cadena=cadena+"H"; // En cada iteración desperdicio un objeto
		// Al final he desperdiciado 1000 objetos
		// 
		// EL primer paso será pasar de String a StringBuilder
		StringBuilder cadenaSB=new StringBuilder("Hola");
		// Al ser mutable puedo ahora hacer de todo
		cadenaSB.append('1'); // Añado un 1 al final
		System.out.println(cadenaSB);
		cadenaSB.insert(1,'S'); // Inserto en posición 1
		System.out.println(cadenaSB);
		cadenaSB.setCharAt(2,'X'); // Pone una X en posición 2
		System.out.println(cadenaSB);
		cadenaSB.reverse(); // Da la vuelta a la cadena
		System.out.println(cadenaSB); // Ésto funciona pero mejor
		// Último paso volver al tipo String
		String resultado=cadenaSB.toString();
		System.out.println(resultado);
	}

}
