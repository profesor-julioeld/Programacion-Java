package examenes.matrices.normal.ejercicio2;

import java.util.Arrays;

public class Apartado1 {
    public static void main(String[] args) {
        int[][] matriz={{1,3},{7,2,6},{5}};
        gira(matriz);
        System.out.println(Arrays.deepToString(matriz));
    }

    private static void gira(int[][] matriz){
        for (int i=0;i<matriz.length;i++)
            reverse(matriz[i]);
    }

    private static void reverse(int[] array){
        int n=array.length;
        for (int i=0;i<n/2;i++){
            int aux=array[i];
            array[i]=array[n-i-1];
            array[n-i-1]=aux;
        }
    }
}
