package tema2;

import java.util.Scanner;

// Resolución del año biesto para Frikis
// esta solución tiene un serio problema de cara al mantenimiento
// ya que no es evidente cómo has obtenido esta solución
// salvo que lo expliques en el código en cuyo caso se entenderá fácilmente
// Seguro que te encuentras algún caso en el que te sea útil
public class Punto2_bisiesto_v3 {
	
	public static void main(String[] args) {
		int year;
		boolean esBisiesto;
		Scanner entrada=new Scanner(System.in);
		System.out.print(" Escribe el año ? ");
		year=entrada.nextInt();
		entrada.close();
		entrada=null;
		// Obtener el valor del caso
		int valor;
		valor=(year%4==0?4:0)+(year%100==0?2:0)+(year%400==0?1:0);
		// Me quedo con los casos 4 y 7
		esBisiesto=switch(valor) {
			case 4,7-> true;
			default->false;
		};
		System.out.println(" El año "+(esBisiesto?"sí":"no")+" es biesto");
	}

}
