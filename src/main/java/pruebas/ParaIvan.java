package pruebas;

import java.util.Arrays;
import java.util.Scanner;

public class ParaIvan {
    public static void main(String[] args) {
        // Pregunta 1
        Scanner sc=new Scanner(System.in);
        String linea=sc.nextLine();
        StringBuilder sb=new StringBuilder(linea);
        System.out.println("sb = " + sb);
        // Pregunta 2
        StringBuilder sb2=new StringBuilder("123");
        int valor=Integer.parseInt(sb2.toString());
        System.out.println("valor = " + valor);
        // Pregunta 3
        int[] unejemplo={1,2,3};
        int[] ampliado=masEspacios(unejemplo,3);
        System.out.println("unejemplo = " + Arrays.toString(unejemplo));
        System.out.println("amapliado = " + Arrays.toString(ampliado));
    }

    /**
     * Crea un nuevo array al que añadimos cuantos elementos
     * a la derecha del array, los elementos iniciales se copian
     * de inicial al array que devolvemos
     * @param inicial Array a ampliar
     * @param cuantos Espacios a añadir, como máximo se puede duplicar
     *                el array inicial
     * @return El array ampliado
     */
    private static int[] masEspacios(int[] inicial,int cuantos){
        if (cuantos<0 || cuantos>inicial.length*2)
            throw new IllegalArgumentException("cuantos de 0 a 2 veces tamaño del array");
        // Podría usar Arrays.copyOf ya que resuelve esta misma función
        // lo hago paso a paso para que veas el proceso
        int[] nuevo=new int[inicial.length+cuantos];
        if (inicial!=null)
            System.arraycopy(inicial,0,nuevo,0,inicial.length);
        return nuevo;
    }
}
