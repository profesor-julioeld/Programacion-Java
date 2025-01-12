package tema3.contenido;
// En programación hay 3 tipos básicos de bucles:
// 	 Veamos el segundo: Bucle por condición de ejecución (while)
//   Java si implementa un while puro
//   Este bucle itera un bloque siempre que la condición se cumpla
//   PUEDE QUE NO HAGA NINGUNA ITERACIÓN ya que comprueba antes de ejecutar el bloque
public class Punto3_bucleWhile {
	// Quiero mostrar los enteros de 1 a 5 
	// Implementación en Java
	public static void main(String[] args) {
		// Si cambias 1 por 6 no itera ninguna vez
		// sólo imprimirá el valor final de i que será 6
		int i=6;
		while (i<=5) {
			System.out.println(i);
			// MI: Si no cambias el valor de i dentro del while
			// se convierte en un bucle infinito
			i++;
		}
		// Si descomentas lo siguiente da error ya que i
		// Aquí si tiene sentido esta sentencia ya que i tiene
		// como ámbito desde donde se declara hasta el final de main
		System.out.println(i);
	}
}
//En clase explicaremos:
//	- Definición de la sentencia while en programación
//  - Sentencia while en Java
//  - Estudio con diagrama de flujo del funcionamiento interno
