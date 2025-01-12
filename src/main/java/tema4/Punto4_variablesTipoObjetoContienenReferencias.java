package tema4;
// Este ejercicio es para ver claramente que una variable de tipo objeto
// contiene una referencia al objeto
// Las comparaciones las haremos de otra manera, preferiblemente con
// funciones específicas de la clase que manejemos
public class Punto4_variablesTipoObjetoContienenReferencias {

	public static void main(String[] args) {
		StringBuilder a=new StringBuilder("pepe");
		StringBuilder b=new StringBuilder("pepe");
		StringBuilder c=b; // Copia la referencia, no el objeto
		// La comparacion es entre las referencias
		if (a==b) System.out.println("Son iguales a y b (==)");
		// Este código es para Ivan porque decía que se comparaban 
		// de forma correcta con equals lo cual no es cierto
		if (a.equals(b)) System.out.println("Son iguales a y b (equals)");
		// Esta forma si compara contenidos, así lo especifica StringBuilder
		if (a.compareTo(b)==0) System.out.println("Son iguales a y b (guay)");
		if (b==c) System.out.println("Son iguales b y c");
		// En muchos libros dicen que la función hashCode() permite
		// ver esa referencia pero no es cierto ya que cada clase
		// puede cambiar su comportamiento
	}
	
 	
	

}
