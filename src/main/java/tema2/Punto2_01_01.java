package tema2;

import java.util.Locale;
import java.util.Scanner;

public class Punto2_01_01 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.US);
		System.out.println(" Dime el díametro en mm ? ");
		double diametro=sc.nextDouble();
		sc.close();
		sc=null;
		double seccion=Math.PI*(diametro/2.0)*(diametro/2.0);
		System.out.println(" La sección exacta es "+seccion);
		calculaSeccion(1.5,seccion,20);
		calculaSeccion(2.5,seccion,20);
		calculaSeccion(4,seccion,20);
	}
	
	/* Este es avanzado, tan sólo intenta ver la idea de que
	un bloque pueda tener un nombre y aceptar parámetros como
	en cualquier función matemática */
	private static void calculaSeccion(double tipo,double seccion,double error) {
		if ((tipo-tipo*(error/100.0))<=seccion &&
				seccion<=(tipo+tipo*(error/100.0))) {
				System.out.println("Cable de " +tipo);
		}	
	}
}
