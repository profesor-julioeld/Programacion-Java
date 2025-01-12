package tema4;

public class Punto4_ambitoVariables {
	static int a=1; // Ámbito la clase
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Clase "+a);
		int a=2; // Ámbito desde aquí hasta fin main
		System.out.println("main "+ a);
		{ // int a=3; Da error 
		}
		{ 	int b=3; // Ámbito el bloque
			System.out.println("Bloque 1 "+b);
		}
		{ 	int b=4; // Ámbito el bloque
			System.out.println("Bloque 2 "+b);
		}
		prueba(10);
	}
	// int a : Ámbito la función prueba
	public static void prueba(int a) {
		System.out.println("Clase "+ Punto4_ambitoVariables.a);
		System.out.println("prueba (parámetro) "+ a);
	}

}
