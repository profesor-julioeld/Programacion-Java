package tema5.ejerciciosFinales.Punto5_Ejercicio7_unPocoGraficos;
// Es un código de ejemplo
// tendrás que usar esta clase para crear una versión de las tres en raya con gráficos
// y uso de eventos (aunque sea transparente)
public class Ejercicio5_inicioTest {

	public static void main(String[] args) {
		Tablero t=new Tablero(5);
		t.setTitulo(" Intento de juego de las tres en Raya");
		// Espera 10 segundos a que pulse
		while (t.nextCasilla(10)) { // Si no hay donde pulsar se acaba
			boolean hanPulsado = t.getPulsado();
			t.setCartelUsuario("Ha pulsado alguien? " + (hanPulsado ? "Sí" : "No"));
			if (hanPulsado) {
				int fila = t.getFila();
				int columna = t.getColumna();
				char letra = t.getLetra();
				t.setCartelUsuario(" Ponga la letra H");
				t.writeCasilla(fila, columna, 'H');
			}
		}
		t.setCartelUsuario("espero 5 segundos y cierro");
		try {Thread.sleep(5000);} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//t.close();
	}

}
