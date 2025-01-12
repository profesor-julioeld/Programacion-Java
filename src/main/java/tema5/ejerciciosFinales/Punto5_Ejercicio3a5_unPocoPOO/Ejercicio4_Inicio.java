package tema5.ejerciciosFinales.Punto5_Ejercicio3a5_unPocoPOO;

public class Ejercicio4_Inicio {
	public static void main(String[] args) {
		CuadriculaV2 s=new CuadriculaV2(3);
		s.carga(5); // Sólo cargo 5 elementos
		System.out.println(s);
		System.out.println((s.comprueba()?"Es":"No es")+" una solución");
		s.carga(); // Ésta es la carga por tecladoSystem.out.println(s);
		System.out.println(s);
		System.out.println((s.comprueba()?"Es":"No es")+" una solución");
	}
}
