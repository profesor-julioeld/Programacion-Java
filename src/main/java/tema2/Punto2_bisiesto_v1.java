package tema2;

import java.util.Scanner;

//Resolveremos si un año es bisiesto o no
public class Punto2_bisiesto_v1 {
	
	public static void main(String[] args) {
		int year;
		boolean esBisiesto;
		Scanner entrada=new Scanner(System.in);
		System.out.print(" Escribe el año ? ");
		year=entrada.nextInt();
		entrada.close();
		entrada=null;
		// Ahora los if encadenados con { }
		if (year%4==0) {
			if (year%100==0) {
				if (year%400==0) {
					esBisiesto=true;
				}
				else {
					esBisiesto=false;
				}
			}
			else {
				esBisiesto=true;
			}
		}
		else {
			 esBisiesto=false;
		}
		System.out.println(" Primera versión resultado "+esBisiesto);
		// Como todos los if tienen else y dentro de cada if hay 
		// un sólo if, podemos codificar quitando {} sin miedo
		// NOTA: Ten cuidado porque no siempre se puede simplificar de forma tan sencilla
		if (year%4==0) 
			if (year%100==0) 
				if (year%400==0) esBisiesto=true;
				else esBisiesto=false;
			else esBisiesto=true;
		else esBisiesto=false;
		System.out.println(" Segunda versión resultado "+esBisiesto);
		// Simplificación asumiendo el caso más repetido y modificando el valor con los if 
		// del caso contrario
		esBisiesto=false;
		if (year%4==0) 
			if (year%100==0) 
				{if (year%400==0) esBisiesto=true;}
			else esBisiesto=true;
		// MI: Fíjate en la importancia de las llaves en el if de %400, si no las pones, el else siguiente
		// se aplicaría al if %400 y no al %100
		System.out.println(" Tercera versión, el año "+(esBisiesto?"sí":"no")+" es biesto");
	}

}
