package tema5.ejerciciosFinales.Punto5_Ejercicio3a5_unPocoPOO;
// MUY IMPORTANTE:
//  Explicar muy por encima concepto de herencia de Cuadricula a CuadriculaV2
//  se supone que no disponemos del código de Cuadricula (bueno, sí de la parte protected), 
//  por eso extendemos su clase para añadir en este caso un comportamiento nuevo
/**
 *  V2 de Cuadricula, hereda de la clase Cuadricula
 */
public class CuadriculaV2 extends Cuadricula{
	// Para el Ejercicio 4
	// Amplio Sobrecargando la función carga con un nuevo comportamiento
	public CuadriculaV2(int n) {
		super(n);
	}
	/**
	 * Carga cuantos elementos de la cuadrícula, pidiendo por teclado (si aleatorio es false)
	 * y de forma aleatoria (si aleatorio es true)
	 * @param cuantos Número de elementos a cargar
	 */
	// Al tener diferentes parámetros podemos añadir funcionalidades
	public void carga(int cuantos) {
		for (int i=0;i<n;i++)
			for (int j=0;j<n;j++) {
				if (cuantos==0) return;
				contenido[i][j]=creaAleatorio(n);
				cuantos--;
			}
	}
	
	// Función auxiliar para crear aleatorios
	// Al ser protected, puede usarlo sus hijos
	// Es static porque no necesito crear una Cuadricula para usarlo ya que
	// no depende de sus valores (su estado)
	protected static int creaAleatorio(int n) {
		int M=1;
		int N=n*n;
		return (int) (Math.floor(Math.random()*(N-M+1)+M));
	}
}
