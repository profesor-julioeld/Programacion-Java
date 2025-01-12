package examenes.bucles.recuperacion;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.print(" Dime valor de n? ");
		int n=entrada.nextInt();
		entrada.close();
		entrada=null;
		for (int i=1;i<=n;i++) {
			int blancos=n-i+1;  
			for (int j=1;j<=blancos;j++)
				System.out.printf("[%03d]",j);
			int asteriscos=2*i;
			for (int j=1;j<=asteriscos;j++)
				System.out.printf("%03d-",j*3); 
			System.out.println();
		}
	}	
}
