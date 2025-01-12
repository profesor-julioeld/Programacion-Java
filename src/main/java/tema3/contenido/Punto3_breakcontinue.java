package tema3.contenido;
// Las sentencias break y continue dentro de un bucle sirven para:
// - break al ejecutar dentro del bloque sale del bucle
// - continue al ejecutar dentro del bloque deja de ejecutar 
//    el resto de código del bloque y pasa a la siguiente iteración
public class Punto3_breakcontinue {
	// Las sentencias break y continue aunque su uso es considerado
	// como de programación no estructurada, se utilizan mucho
	// Un break/continue siempre se pueden evitar
	
	// Se pide que encuentres la primera ocurrencia de un carácter concreto
	// en un String
	// Para resolverlo vamos a usar como técnica el método de la bandera
	// Lo implementaremos con break y sin él. 
	public static void main(String[] args) {
		// La bandera está en alto, en cuanto encuentre el
		// caracter la tiro (false) para saber que la encontré
		
		// Lo soluciono con un break
		char buscado='R';
		String cadena="kllkhhkjljhh";
		boolean bandera=true; // No lo he encontrado
		// Codifico el recorrido de toda la cadena
		for (int i=0;i<cadena.length();i++) {
			if (cadena.charAt(i)==buscado) {
				bandera=false; // Tiro la bandera
				break; // Ya no hace falta seguir
			}
		}
		if (bandera) System.out.println("No encontrado");
		else System.out.println("Sí encontrado");
		// PARA QUE PIENSES: Cómo puede hacer para saber la posición?
	
		// Mismo ejercicio pero sin break
		bandera=true;
		for (int i=0;i<cadena.length()&&bandera;i++) 
			if (cadena.charAt(i)==buscado) bandera=false; // Tiro la bandera
		if (bandera) System.out.println("No encontrado");
		else System.out.println("Sí encontrado");
		
		// Un poco más fino 

		for (int i=0;i<cadena.length()&&bandera;i++) 
			bandera=!(cadena.charAt(i)==buscado); 
		if (bandera) System.out.println("No encontrado");
		else System.out.println("Sí encontrado");
		
	}
}
