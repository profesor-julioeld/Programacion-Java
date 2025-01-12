package tema4;
//Es el mismo ejercicio de igual número del punto 3 pero esta vez 
//resuelto bajo el paradigma procedimental 
 public class Punto4_Ejercicio4Punto3 {
	
	
	private static String traduce(String leido,String cadenaOrigen,String cadenaDestino) {
		StringBuilder resultado=new StringBuilder();
		for (int i=0;i<leido.length();i++) {
			char buscado=leido.charAt(i);
			boolean bandera=true; // No encuentro el carácter
			int j;
			for (j=0;j<cadenaOrigen.length();j++) 
			  if (buscado==cadenaOrigen.charAt(j)) {
				  bandera=false;
				  break;
			  }
			resultado.append(bandera?buscado:cadenaDestino.charAt(j));
		}
		return resultado.toString();
	}
	
	public static void main(String[] args) {
		String leido="León";
		String resultado=traduce(leido,"áéíóú","aeiou");
		System.out.println(resultado);
	}

}
