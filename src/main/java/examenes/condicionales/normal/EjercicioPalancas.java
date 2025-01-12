package examenes.condicionales.normal;
import java.util.Scanner;

public class EjercicioPalancas {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.print(" Valor de las tres palancas? ");
		int a=entrada.nextInt();
		int b=entrada.nextInt();
		int c=entrada.nextInt();
		entrada.close();
		entrada=null;
		boolean siCae=false;
		if (a==1) siCae=!siCae;
		if (b==1) siCae=!siCae;
		if (c==1) siCae=!siCae;
		System.out.println(" la bola "+(siCae?"sí":"no")+" cae");
	}

}
