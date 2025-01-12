package tema4;
// Java sólo tiene paso de parámetros por valor, ello no quiere decir 
// cualquier parámetro pasado no se puede modificar
// se podrá modificar cualquier objeto que pasemos como parámetro 
// que sea Mutable
public class Punto4_pasarPorValorObjetosMutableseInmutables {

	public static void main(String[] args) {
		// Ejemplo con objetos inmutables
		String a="pepe";
		modificoString(a);
		// Puedes ver que no has modificado nada
		System.out.println("Contenido de a "+a);
		// Ejemplo con objetos mutables
		StringBuilder a2=new StringBuilder("pepe");
		modificoStringBuilder(a2);
		// Aunque el paso sea por valor, hemos podido modificar el objeto
		System.out.println("Contenido de a2 "+a2);	
	}
	
	private static void modificoString(String s) {
		s="Juan";
	}
	
	private static void modificoStringBuilder(StringBuilder s) {
		s.append("-añadido");
	}
	
 	
	

}
