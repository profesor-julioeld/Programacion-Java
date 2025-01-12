package tema3.contenido;

import java.util.Random;

// En programación hay 3 tipos básicos de bucles:
// 	 Veamos el tercero: Bucle por condición de finalización (repeat)
//   Java no implementa un repeat puro
//   Este bucle itera un bloque hasta que se cumple la condición
//   SIEMPRE EJECUTA UNA VEZ ya que comprueba después de ejecutar el bloque
public class Punto3_bucleRepeat {
	// Quiero generar números aleatorios de 1 a 100
	// en cuanto tenga 5 paro
	public static void main(String[] args) {
		// Se implementa con do while en Java
		// pero en Java la cond siempre es de ejecución
		// no de finalización pero es fácil de solucionar
	 	// Para ver cómo se generan número aleatorios he creado
	 	// un fichero específico, ahora nos limitamos a copia/pegar
	 	int aleatorio;
	 	int cuantos=0;
		Random r=new Random();
		do {
			aleatorio = r.nextInt(100)+1;
			System.out.println(aleatorio);
			cuantos++;
		} while (!(cuantos==5)); // Siempre termina en ;
		// Aunque tengo que poner condicion de ejecución
		// para poder cond terminación es tan sencillo como
		// antecederla con ! . 
	}
}
//En clase explicaremos:
//	- Definición de la sentencia repeat en programación
//  - Sentencia do while en Java
//  - Estudio con diagrama de flujo del funcionamiento interno
// NOTA: Intenta mejorar un poco el hardcodeo del valor 5