package tema2;

import java.util.Scanner;

//Resolveremos si un año es bisiesto o no
public class Punto2_bisiesto_v2 {
	
	public static void main(String[] args) {
		int year;
		boolean esBisiesto;
		Scanner entrada=new Scanner(System.in);
		System.out.print(" Escribe el año ? ");
		year=entrada.nextInt();
		entrada.close();
		entrada=null;
		// Obtenido la expresión booleana sin simplificar
		esBisiesto=((year%4==0)&&!(year%100==0)&&!(year%400==0)) ||
		           ((year%4==0)&& (year%100==0)&& (year%400==0));
		// Si usamos los mapas de Karnaught obtenemos una expresión mínima como
		esBisiesto=(year%4==0)&&(!(year%100==0)||(year%400==0));
		System.out.println(" El año "+(esBisiesto?"sí":"no")+" es biesto");
	}

}
