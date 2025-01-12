package tema2;
// En este tema es interesante ver:
//   -- Definición de expresión booleana (Hay un tema en Drive con el mismo nombre)
//   -- árboles de decisión (ejem para ordenar 3 números)
//   -- !<= es >  y !>= es <
//   -- Tablas de verdad para expresiones
//   -- Teorema de Morgan

import java.util.Scanner;

public class Punto2_03_02 {

	public static void main(String[] args) {
		// Cuando un bloque anidado tiene una única sentencia
		// se puede evitar el uso de llaves
		// .....pero no siempre será buen idea
		int temp,hum;
		Scanner sc=new Scanner(System.in);
		System.out.print("Escribe temperatura y humedad? ");
		temp=sc.nextInt();
		hum=sc.nextInt();
		sc.close();
		sc=null;
		// Si la temperatura es mayor o igual a 45 grados
		// y la humedad mayor 55%, apago el aparato
		// Si la temperatura es menor a 45 grados enciendo
		// NOTA: Pintar el árbol de decisión
		
		// Si el bloque para la parte Then o Else está formado
		// por una sola sentencia, se puede no poner {} pero
		// no te olvides de terminar la sentencia con ;
		if (temp>=45)  
		  if (hum>55) System.out.println("Apago");
		else System.out.println("Enciendo");
		// Prueba con temp=43 y dime si funciona
		// Ahora prueba este otro código comentando el anterior
		/* if (temp>=45)  
		  { if (hum>55) System.out.println("Apago"); }
		else System.out.println("Enciendo");*/
	}

}
