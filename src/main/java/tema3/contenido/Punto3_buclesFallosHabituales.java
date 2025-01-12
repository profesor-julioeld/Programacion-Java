package tema3.contenido;
// Ya hemos comentado que si dentro de un bucle controlado por
// condición, si no cambias algo dentro del bloque para modificar
// la condición, el bucle se hará infinito 
// Vamos a ver otros errores que crean bucles infinitos sin quererlo
public class Punto3_buclesFallosHabituales {
	// Como estos bucles generan bucles infinitos,
	// comentalos todos menos el que quieras probar
	public static void main(String[] args) {
		// Un ; mal puesto puede dar quebraderos de cabeza
		// Utiliza la ventana debug para ver lo que se ha quedado
		// en ejecución
		/*int i=1;
		while (i<=5); {
			System.out.println(i);
			i++;
		}*/
		// Es habitual que nos equivoquemos de variable sobre todo
		// en los bucles anidados
		for (int i=1;i<=3;i++)
			for (int j=1;i<=4;j++)
				System.out.println("Fila "+i+" columna "+j);
		
	}
	// Dejamos abierto este proyecto porque seguro se te ocurre
	// algún que otro caso
}
