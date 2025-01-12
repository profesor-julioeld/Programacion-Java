package tema2;
// Importante en este punto tener en cuenta:
//   - No mezclar "efectos diferentes" en una misma expresión
//   - Si lo hacemos y obtenemos resultados no esperados, usar & u |
public class Punto2_01_02 {

	public static void main(String[] args) {
		// And con cortocircuito
		int a=3;
		boolean resa=(false)&&(++a==4);
		System.out.println(resa);
		System.out.println(a);
		// And sin cortocircuito
		int b=3;
		boolean resb=(false)&(++b==4);
		System.out.println(resb);
		System.out.println(b);

	}

}
