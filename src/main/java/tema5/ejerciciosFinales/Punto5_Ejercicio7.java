package tema5.ejerciciosFinales;
// Resuelve el ejercicio 7 en el que programamos el juego de las tres en raya 
// pero usando gráficos y eventos.

import tema5.ejerciciosFinales.Punto5_Ejercicio7_unPocoGraficos.Tablero;

public class Punto5_Ejercicio7 {
	private final static int MAX=3;
	private final static char X='X';
	private final static char O='O';
	public static void main(String[] args) {
		Tablero t=new Tablero(MAX);
		char turno=X;
		boolean ganador=false;
		t.setTitulo("Juego de las tres en raya");
		t.setCartelUsuario("Toca turno a "+turno);
		while (t.nextCasilla(10)) { // Si no hay donde pulsar se acaba
			boolean hanPulsado=t.getPulsado();
			if (hanPulsado) {
				int fila=t.getFila();
				int columna=t.getColumna();
				t.writeCasilla(fila,columna,turno);
			}
			// Podría ganar con esta jugada
			ganador=ganador(t,turno);
			if (ganador) {
				t.setCartelUsuario("Ganador "+turno);
				break;
			}
			turno=turno==X?O:X;
			t.setCartelUsuario("Toca turno a "+turno);
		}
		if (!ganador) t.setCartelUsuario("TABLAS");
		try {Thread.sleep(2000);} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t.setCartelUsuario("espero 5 segundos y cierro");
		try {Thread.sleep(5000);} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t.close();
 	}
	
	/* Está es la codificación sin usar la función línea
	private static boolean ganador(Tablero t,char valor) {
		// Solución hardcodeada , busca otra opción para n.
		return (t.readCasilla(1,1)==valor && t.readCasilla(1,1)==t.readCasilla(1,2) && t.readCasilla(1,2)==t.readCasilla(1,3)) ||
			   (t.readCasilla(2,1)==valor && t.readCasilla(2,1)==t.readCasilla(2,2) && t.readCasilla(2,2)==t.readCasilla(2,3)) ||
			   (t.readCasilla(3,1)==valor && t.readCasilla(3,1)==t.readCasilla(3,2) && t.readCasilla(3,2)==t.readCasilla(3,3)) ||
			   (t.readCasilla(1,1)==valor && t.readCasilla(1,1)==t.readCasilla(2,1) && t.readCasilla(2,1)==t.readCasilla(3,1)) ||
			   (t.readCasilla(1,2)==valor && t.readCasilla(1,2)==t.readCasilla(2,2) && t.readCasilla(2,2)==t.readCasilla(3,2)) ||
			   (t.readCasilla(1,3)==valor && t.readCasilla(1,3)==t.readCasilla(2,3) && t.readCasilla(2,3)==t.readCasilla(3,3)) ||
			   (t.readCasilla(1,1)==valor && t.readCasilla(1,1)==t.readCasilla(2,2) && t.readCasilla(2,2)==t.readCasilla(3,3)) ||
			   (t.readCasilla(1,3)==valor && t.readCasilla(1,3)==t.readCasilla(2,2) && t.readCasilla(2,2)==t.readCasilla(3,1)); 
	} */
	
	// Para simplificar la codificación y evitar errores creo la función línea
	private static boolean linea(Tablero t,char valor,int x1,int y1,int x2,int y2,int x3,int y3) {
		return t.readCasilla(x1,y1)==valor && t.readCasilla(x1,y1)==t.readCasilla(x2,y2) && t.readCasilla(x2,y2)==t.readCasilla(x3,y3);
	}
	
	// Codificación usando la función línea
	// Aquí se ve claramente que podría resolverse con bucles
	private static boolean ganador(Tablero t,char valor) {
		return (linea(t,valor,1,1,1,2,1,3)) ||
			   (linea(t,valor,2,1,2,2,2,3)) ||
			   (linea(t,valor,3,1,3,2,3,3)) ||
			   (linea(t,valor,1,1,2,1,3,1)) ||
			   (linea(t,valor,1,2,2,2,3,2)) ||
			   (linea(t,valor,1,3,2,3,3,3)) ||
			   (linea(t,valor,1,1,2,2,3,3)) ||
			   (linea(t,valor,1,3,2,2,3,1)); 
	} 
	
	
}