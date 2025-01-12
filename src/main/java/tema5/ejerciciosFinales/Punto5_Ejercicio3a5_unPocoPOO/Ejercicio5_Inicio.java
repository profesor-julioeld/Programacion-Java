package tema5.ejerciciosFinales.Punto5_Ejercicio3a5_unPocoPOO;

public class Ejercicio5_Inicio {
	public static void main(String[] args) {
		CuadriculaV3 s=new CuadriculaV3(3);
		s.carga(); // No es la carga por teclado
		// Imprimo el sudoku
		System.out.println(s);
		System.out.println((s.comprueba()?"Es":"No es")+" una solución");
	}
}
