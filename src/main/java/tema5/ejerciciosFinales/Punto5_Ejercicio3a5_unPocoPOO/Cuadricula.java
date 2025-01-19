package tema5.ejerciciosFinales.Punto5_Ejercicio3a5_unPocoPOO;
// MUY IMPORTANTE:
//  Explicar muy por encima los elementos de esta clase
//    - Contructor
//    - atributo/método privados
//    - atributo/método público
//  Comentar el efecto que tiene la autodoc /** , echar un vistazo al pedir ayuda
//  en main
import java.util.Scanner;
/**
 *  Una Cuadricula representa una matriz cuadrada de nxn elementos enteros
 *  cada elemento puede valer de 1 a nxn 
 *  no tienen por qué estar rellenos todos los elementos
 */
public class Cuadricula {
	protected int n;
	protected int[][] contenido;
	public Cuadricula(int n){
		this.n=n; // Ya lo emplicaremos más adelante 
		contenido=new int[n][n];
	}
	
	/**
	 *  Esta función te pedirá por teclado los valores para todos los elementos de la cuadrícula
	 *  Puedes poner un número del 1 al nxn, si no quieres ocupar ese elemento escribe algo diferente   
	 */
	public void carga() {
		Scanner entrada=new Scanner(System.in);
		for (int i=0;i<n;i++)
			for (int j=0;j<n;j++) {
				System.out.printf(" Dime posicion [%2d,%2d]? ",i+1,j+1);
				int leido=entrada.nextInt();
				leido=(leido>=1&&leido<=9)?leido:0;
				contenido[i][j]=leido;			
			}
		entrada.close();
	}
	
	/**
	 * Dada una cuadrícula ya rellena, devolverá true si forman una solución
	 * Una solución se forma si hemos sido capaces de poner todos los números
	 * del 1 al nxn , sin repetición, en los nxn elementos
	 * @return devuelve true si forman solución, false en caso contrario
	 */
	public boolean comprueba() {
		// Para ser una solución tienen que estar los números de 1 a 9 
		// y no repetirse (no hace falta comprobar al haber 9 huecos)estan
		boolean estanTodos[]=new boolean[n*n]; 
		for (int[] fila:contenido)
			for (int valor:fila) {
				if (valor==0) return false;
				// EL valor 5 lo guardo en posición 4
		        estanTodos[valor-1]=true;
			}
		for (int i=0;i<n*n;i++)
			if (!estanTodos[i]) return false;
		return true;
	}
	
	@Override
	/*
	  Sobreescribe toString de Objeto para que represente la Cuadrícula
	  con sus elementos escritos empezando por filas
	 */
	public String toString() {
		// Son pocos objetos pero quizás mejor con StringBuffer
		String salida="";
		for (int i=0;i<contenido.length;i++) {
			for (int j=0;j<contenido[i].length;j++)
				salida+=String.format("[%1d]",contenido[i][j]);
			salida+='\n';
		}
		return salida;
	}

}
