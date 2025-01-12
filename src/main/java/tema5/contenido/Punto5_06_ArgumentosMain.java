package tema5.contenido;
// Aunque el punto 5.6 del libro trata sobre parametros tipo array
// en funciones, ya hicimos un ejercicio al respecto en el 5.5
// Nos fijaremos ahora en los parámetros de main
public class Punto5_06_ArgumentosMain {
	// Main recibe un array de String
	public static void main(String[] args) {
		for (String par:args) 
			System.out.println(" Paramétro pasado "+par);
		for (int i=0;i<args.length;i++)
			System.out.printf(" Param. i=%d valor='%s' \n",i,args[i]);
	}
}
// No sale nada y te preguntarás cómo hacer que funcione, te doy dos opciones:
//  - Desde el IDE: Desde run Configuración/argumentos
//  - Ejecutado desde linea de comandos:
//      Sitúate en el directorio bin del proyecto
//        C:\Diurno\eclipse-workspace\PROG (2024.06)\Libro Paraninfo\bin>
//      Desde allí ejecuta el comando 
//        java tema5.Punto5_06_ArgumentosMain hola que tal
// MUY IMPORTANTE: Ya tienes una forma sencilla para no hardcodear tus programas
