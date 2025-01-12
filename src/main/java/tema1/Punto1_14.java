package tema1;

public class Punto1_14 {
	public static void main(String[] args) {
		// int a=2.3; // Si lo descomenta da error
		int b;
		double c;
		b=3;
		c=b; // Se produce una conversión implícita y no da error
		c=2.3;
		b=(int)c; // Realizamos una conversión forzada (cast)
		// Recuerda que si quieres que una división se realice 
		// con decimales, tienes que poner 2.0 y no 2
		System.out.println(3/2);
		System.out.println(3/2.0);
		c=3/2;
		System.out.println(c);
		c=3/2.0; // Se convierte todo a double, digo double y no float
		System.out.println(c);
		//float f1=3/2.0; // Si lo descomentas da error, intenta pasar de double a float
		float f2=(float)(3/2.0); // Éste si funciona
	}
}
