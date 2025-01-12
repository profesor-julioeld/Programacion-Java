package tema2;

import java.util.Scanner;
//La probabilidad de error en la v1 con tanto if encadenado es muy alta
//sobretodo si no usamos llaves.
//Vamos a intentar aplanar el árbol poniendo un if por cada caso
//Recorreremos cada rama y apuntaremos la Exp Booleana equivalente
//a cada camino para ponerla en cada if 

public class Punto2_ordenar_v2 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner entrada=new Scanner(System.in);
		System.out.print(" Escribe tres números ? ");
		a=entrada.nextInt();
		b=entrada.nextInt();
		c=entrada.nextInt();
		entrada.close();
		entrada=null;
		// Un if para cada caso. NOTA: Fíjate en los () antes del !
		// MI: No te parece que así te equivocas menos?
		// No te asustes, los árboles de decisión normalmente
		// no están tan llenos de acciones como éste
		if (  a>b &&  b>c)          System.out.println(a+"-"+b+"-"+c);
		if (  a>b &&!(b>c)&&  c>a)  System.out.println(c+"-"+a+"-"+b);
		if (  a>b &&!(b>c)&&!(c>a)) System.out.println(a+"-"+c+"-"+b);
		if (!(a>b)&&  a>c)          System.out.println(b+"-"+a+"-"+c);
		if (!(a>b)&&!(a>c)&&  b>c)  System.out.println(b+"-"+c+"-"+a);
		if (!(a>b)&&!(a>c)&&!(b>c))	System.out.println(c+"-"+b+"-"+a);
	}
}
