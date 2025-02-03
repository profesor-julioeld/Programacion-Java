package examenes.matrices;

import tema5.ejerciciosFinales.Punto5_Ejercicio7_unPocoGraficos.Tablero;

// Es un código de ejemplo
// tendrás que usar esta clase para crear una versión de las tres en raya con gráficos
// y uso de eventos (aunque sea transparente)
public class Ejercicio3 {
	private static final int N=4;
	private static final char X='X';
	private static final char O='O';
	public static void main(String[] args) {
		Tablero t=new Tablero(N);
		t.setTitulo(" Juego del mas rápido");
		char turno=O;
		// Espera 1 segundo a que pulse
		t.setCartelUsuario("Toca turno a "+turno);
		while (t.nextCasilla(1)) { // Si no hay donde pulsar se acaba
			boolean hanPulsado = t.getPulsado();
			if (hanPulsado)
				t.writeCasilla(t.getFila(),t.getColumna(),turno);
			turno=turno==X?O:X;
			t.setCartelUsuario("Toca turno a "+turno);
		}
		// Tengo tres casos: Ganan X, Ganan O o tablas
		int[] resultado=sumaTurnos(t);
		if (resultado[0]>resultado[1]) t.setCartelUsuario("Gana las O");
		if (resultado[1]>resultado[0]) t.setCartelUsuario("Gana las X");
		if (resultado[0]==resultado[1]) t.setCartelUsuario("Tablas");
		try {Thread.sleep(5000);} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t.close();
	}

	// Suma las X y las O que se encuentre y devuelve
	// en [0] las O y en [1] las X
	// Supongo que todas las casillas están llenas
	private static int[] sumaTurnos(Tablero t){
		int[] resultado=new int[2];
		for (int i=1;i<=N;i++)
			for (int j=1;j<=N;j++){
				int indice=t.readCasilla(i,j)==O?0:1;
				resultado[indice]++;
			}
		return resultado;
	}

}
