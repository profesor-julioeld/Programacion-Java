package tema5.ejerciciosFinales.Punto5_Ejercicio3a5_unPocoPOO;
// MUY IMPORTANTE:
//  En este caso CuadriculaV3 sería un hijo de CuadriculaV2 y nieto de Cuadricula
//  pintar un gráfico con las herencias a nivel de clase
 /**
 *  V3 de Cuadricula, hereda de la clase CuadriculaV2
 */
public class CuadriculaV3 extends CuadriculaV2{
	// Para el Ejercicio 5
	// En este caso uso voy a sobreescribir el comportamiento de la carga de Cuadricula
	// para que no lea de teclado sino rellena aleatoriamente pero siendo solución
	public CuadriculaV3(int n) {
		super(n);
	}
	/** Carga la cuadricula con números aleatorios del 1 al nxn siendo solución
	 */
	@Override // Sobreescribo el comportamiento del abuelo, ya no pide por teclado
	public void carga() {
		boolean obtenidos[]=new boolean[n*n];
		for (int i=0;i<n;i++)
			for (int j=0;j<n;j++) {
				int valor;
				do {
					valor=creaAleatorio(n);
				} while (obtenidos[valor-1]);
				obtenidos[valor-1]=true;
				contenido[i][j]=valor;
			}
	}
}
