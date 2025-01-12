package tema3.contenido;
// En programación hay 3 tipos básicos de bucles:
//   Veamos el primero: Bucle por contador (for)
//   Este bucle itera un bloque un número de veces controlado
//   por una varible que marca cada iteración
//   Java no tiene una implementación "pura" de ese for
//   ya que pide que pongas una condición
public class Punto3_bucleFor {
	// Quiero mostrar los enteros de 1 a 5 
	// Implementación en Java
	public static void main(String[] args) {
		for (int i=1;i<=5;i++) {
			// i va cambiando en cada iteración
			System.out.println(i);
		}
		// Si descomentas lo siguiente da error ya que i
		// sólo existe dentro del for (hace referencia al ámbito de la variable)
		// System.out.println(i);
	}
}
// En clase explicaremos:
//	- Definición de la sentencia for (bucle por contador) en programación
//  - Posibles implementaciones en Java, por ejemplo con sentencia Java for
//  - Estudio con diagrama de flujo del funcionamiento interno de esta sentencia
