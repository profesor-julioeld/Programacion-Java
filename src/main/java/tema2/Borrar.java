package tema2;

import java.util.Locale;
import java.util.Scanner;

public class Borrar {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		entrada.useLocale(Locale.US);
		System.out.print(" Escribe dos números ? ");
		int a=entrada.nextInt();
		int b=entrada.nextInt();
		entrada.close();
		if (a>b) System.out.println(a+"-"+b);
		else System.out.println(b+"-"+a);
		
	}

}
