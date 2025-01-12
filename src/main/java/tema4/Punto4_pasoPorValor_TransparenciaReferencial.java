package tema4;
// Ejercicio una vez explicada la diferencia entre paso de parámetros
// por valor o por referencia
public class Punto4_pasoPorValor_TransparenciaReferencial {
	// En caso de usar una variable global dentro de una función
	// no se cumpliría el principio de transparencia referencial
	static int joker=3;
	// Ejemplo de función 
	
	static int f(int a,int b) {
		int aux=a+b;
		return aux+joker;
	}
	
	static void escondido() {
		joker=-2;
	}
	public static void main(String[] args) {
		int a=3;
		int b=4;
		escondido(); // Mejor no usar este tipo de variables en funciones
		int resultado=f(a,b);
		System.out.println(resultado);
	}

}
