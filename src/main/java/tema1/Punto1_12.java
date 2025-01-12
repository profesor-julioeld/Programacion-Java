package tema1;
import java.time.LocalTime;
import java.util.Locale;
import java.util.Scanner;

public class Punto1_12 {
	public static void main(String[] args) {
		// Si escribo la siguiente línea (LocalTime ..)
		// El IDE dará error ya que no sabe dónde está
		// Si pulsas en el error te indica cómo solucionarlo
		// añadiendo el import necesario
		LocalTime queHoraEs;
		// Cuando escribas LocalTime seguido de . , el IDE
		// te muestra las opciones posibles
		queHoraEs=LocalTime.now();
		// Fíjate que no sólo muestra Hora, minutos y segundos
		System.out.println(queHoraEs);
		// En este caso no es necesario el import porque de
		// forma implícita llevaría import java.lang.*
		System.out.println(Math.PI);
		// El caracter intro se presenta como \n
		System.out.print(" Mensaje que \n termina aquí \n");
		// Uso dinámico de una clase
		Scanner entrada=new Scanner(System.in);
		// Si quieres que 12.3 lo interprete como decimal
		// sino utilizará la conf regional del equipo
		// por lo que antes nextDouble() pedirá 12,3
		// entrada.useLocale(Locale.US);
		System.out.print(" Escribe un número ? ");
		int valor=entrada.nextInt();
		System.out.println(" Has escrito "+valor);
		// Si no cierras este recurso te saldrá un warning
		entrada.close();
		// Ejecuta varias veces el programa y escribe entradas
		// que nada tengan que ver con un número entero 
		// ejem: 12,3 Hola etc
		// Prueba también qué pasa si escribo ese número y algo más
	}
}
