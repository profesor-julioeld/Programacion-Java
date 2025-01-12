package tools;
// Tienes que tener cuidado cuando quieras aproximar un 
// decimal a entero ya que quizás un cast a int no hará lo que esperas
// Vamos a ver la diferencia entre usar (int) y Math.floor
public class FloorVSInt {
	public static void main(String[] args) {
		// Tratando número positivos no hay problema
		// Ambos aproximan hacia abajo: Quitan la parte decimal
		double d=2.34;
		int i=(int)d; // Con el cast convertimos tipos
		System.out.println(i);
		double fd=Math.floor(d);
		System.out.println(fd);
		System.out.println((int)fd); // Si lo quieres entero
		// El problema surge con los negativos ya que:
		//  - int quita la parte decimal directamente
		//        Se dice que aproxima hacia cero
		//  - floor aproxima hacia abajo siempre 
		double dn=-2.67;
		int in=(int)dn; // Éste devuelve -2
		System.out.println(in);
		double fdn=Math.floor(dn); //Éste devuelve -3.0
		System.out.println(fdn);
		System.out.println((int)fdn);
	}
}
