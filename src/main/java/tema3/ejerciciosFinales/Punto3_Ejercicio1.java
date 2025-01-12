package tema3.ejerciciosFinales;
//Dado un valor n entero, calculamos su representación
//en binario
public class Punto3_Ejercicio1 {

	public static void main(String[] args) {
		// Datos para el proceso
		int n=30;
		int base=8;
		// Procesamiento
		int dividendo,divisor,cociente,resto;
		dividendo=n;
		divisor=base; 
		StringBuilder resultado=new StringBuilder();
		while (dividendo>=divisor) {
			cociente=dividendo/divisor;
			resto=dividendo-cociente*divisor;
			resultado.insert(0,resto);
			dividendo=cociente;
		}
		resultado.insert(0,dividendo);
		System.out.println(resultado);
	}
}
