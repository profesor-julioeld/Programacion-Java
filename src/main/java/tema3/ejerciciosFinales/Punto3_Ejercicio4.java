package tema3.ejerciciosFinales;
// Traducir todo lo leido por terminal realizando las sustituciones de los caracteres de 
// cadenaOrigen por los de cadenaDestino que esten en la misma posición
 public class Punto3_Ejercicio4 {

	public static void main(String[] args) {
		String leido="León";
		String cadenaOrigen="áéíóú";
		String cadenaDestino="aeiou";
		for (int i=0;i<leido.length();i++) {
			char buscado=leido.charAt(i);
			boolean bandera=true; // No encuentro el carácter
			int j;
			for (j=0;j<cadenaOrigen.length();j++) 
			  if (buscado==cadenaOrigen.charAt(j)) {
				  bandera=false;
				  break;
			  }
			System.out.print(bandera?buscado:cadenaDestino.charAt(j));
		}
		System.out.println();
	}

}
