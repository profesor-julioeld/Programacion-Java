package tema3.contenido;
// Veamos ahora los bucles anidados dependientes, los aplicaremos
// en la solución del siguiente problema:
//  Dado un valor n leido por teclado, pintaremos un árbol formado por 
//  asteriscos y tendrá tantas filas como valor de n
//  para el caso de n=2 pintaremos el siguiente árbol:
//     *
//    ***
//  En caso de valor n=3 tendrá tres niveles y así sucesivamente
// Puedes encontrar cómo se ha deducido este código en el documento pdf
// adjunto al tema3 y de nombre "Análisis de arboles"
public class Punto3_arbolitosConBuclesAnidados {

	public static void main(String[] args) {
		int n=5;
		for (int i=1;i<=n;i++) {
			int blancos=n-i;
			for (int j=1;j<=blancos;j++)
				System.out.print(' ');
			int asteriscos=2*i-1;
			for (int j=1;j<=asteriscos;j++)
				System.out.print('*');
			System.out.println();
		}
	}	
}
