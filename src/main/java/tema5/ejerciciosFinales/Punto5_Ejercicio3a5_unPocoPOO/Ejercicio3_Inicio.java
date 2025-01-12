package tema5.ejerciciosFinales.Punto5_Ejercicio3a5_unPocoPOO;

// Creo un objeto de tipo Cuadricula y lo uso sabiendo lo que es
// y qué hacen sus método y atributos (público) pero nada necesito ni debo saber
// de cómo lo hace,
public class Ejercicio3_Inicio {
	public static void main(String[] args) {
		Cuadricula s=new Cuadricula(3);
		s.carga();
		// Imprimo el sudoku
		System.out.println(s);
		System.out.println((s.comprueba()?"Es":"No es")+" una solución");
	}
}
