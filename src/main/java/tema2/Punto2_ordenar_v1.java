package tema2;

import java.util.Scanner;

//Resolveremos la ordenación de tres enteros usando if encadenados
//Partiremos de un árbol de decisión adjunto al tema2
//Codificaremos usando if encadenados en esta versión
public class Punto2_ordenar_v1 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner entrada=new Scanner(System.in);
		System.out.print(" Escribe tres números ? ");
		a=entrada.nextInt();
		b=entrada.nextInt();
		c=entrada.nextInt();
		entrada.close();
		entrada=null;
		// Ahora los if encadenados con { }
		if (a>b) {
			if (b>c) {
				System.out.println(a+"-"+b+"-"+c);
			}
			else {
				if (c>a) {
					System.out.println(c+"-"+a+"-"+b);
				}
				else {
					System.out.println(a+"-"+c+"-"+b);
				}
			}
		}
		else {
			if (a>c) {
				System.out.println(b+"-"+a+"-"+c);
			}
			else {
				if (b>c) {
					System.out.println(b+"-"+c+"-"+a);
				}
				else {
					System.out.println(c+"-"+b+"-"+a);
				}
					
			}
		}
		// Como todos los if tienen else y dentro de cada if hay 
		// un sólo if, podemos codificar quitando {} sin miedo
		if (a>b) 
			if (b>c) System.out.println(a+"-"+b+"-"+c);
			else 
				if (c>a) System.out.println(c+"-"+a+"-"+b);
				else System.out.println(a+"-"+c+"-"+b);
		else 
			if (a>c) System.out.println(b+"-"+a+"-"+c);
			else 
				if (b>c) System.out.println(b+"-"+c+"-"+a);
				else System.out.println(c+"-"+b+"-"+a);
		// Cómo sabes que el programa funciona?
		// Probando un caso de cada combinación:
		//   3 2 1 a>b && b>c
		//   etc etc 
	}

}
