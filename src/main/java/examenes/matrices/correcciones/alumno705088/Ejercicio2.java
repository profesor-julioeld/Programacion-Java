package examenes.matrices.correcciones.alumno705088;

import java.util.Arrays;

public class Ejercicio2 {
    public static void main(String[] args) {
        int n = 4;
        int matriz[][] = creaMatriz(n);
        int suma = sumaM(matriz);
        System.out.println(suma);
        System.out.println(Arrays.deepToString(matriz));
    }

    public static int[][] creaMatriz(int n) {
        int matriz[][] = new int[n][];
        System.out.println("matriz.length = " + matriz.length);
        for(int i=0;i<matriz.length;i++) {
            matriz[i] = new int[randomN(3,12)]; //no sé como declararlo, no funciona
            for(int j=0;j<matriz[i].length;j++) {
                matriz[i][j] = randomN(1, 9);
            }
        }
        return matriz;
    }

    public static int randomN(int m,int n) {
        int valor = (int) (Math.floor(Math.random()*(n-m+1)+m));
        return valor;

    }

    public static int sumaM(int matriz[][]) {
    int suma=0;
    for(int i=0;i<matriz.length;i++) {
        for(int j=0;j<matriz[i].length;j++) {
            suma+=matriz[i][j];
        }
    }
    return suma;
    }
}