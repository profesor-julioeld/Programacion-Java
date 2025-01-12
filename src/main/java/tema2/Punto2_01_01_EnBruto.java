package tema2;

import java.util.Locale;
import java.util.Scanner;

public class Punto2_01_01_EnBruto {

	public static void main(String[] args) {
		// Vamos a mejorar el programa que propuse
		// para saber si un cable es de 2,5 4 6 o 10 mm2
		// sabiendo su diametro medida con un pie de Rey
		// La mejora consiste en que en vez de sólo calcular
		// la sección diremos directamente el tipo de cable
		// Consideraremos un error de un 20% arriba y abajo
		//
		// Ejemplos de valores de sección:
		//    1,6 2,42 1,25 2,39 3,00
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.US);
		System.out.print(" Dime el díametro en mm ? ");
		double diametro=sc.nextDouble();
		sc.close();
		sc=null;
		double seccion=Math.PI*(diametro/2.0)*(diametro/2.0);
		// Cuando calculemos las expresiones booleanas
		// pintar los tramos <= >= combinados con && y ||
		// ver cuál es el correcto
		System.out.println(" La sección exacta es "+seccion);
		if ((1.5-1.5*(20.0/100.0))<=seccion &&
				seccion<=(1.5+1.5*(20.0/100.0))) {
				System.out.println("Cable de 1.5");
		}; /* No necesita este ; no da error porque un ; 
		suelto se considera una sentencia nula */
		if ((2.5-2.5*(20.0/100.0))<=seccion &&
				seccion<=(2.5+2.5*(20.0/100.0))) {
				System.out.println("Cable de 2.5");
		}
		if ((4.0-4.0*(20.0/100.0))<=seccion &&
				seccion<=(4.0+4.0*(20.0/100.0))) {
				System.out.println("Cable de 4.0");
		}
	}
	
}
