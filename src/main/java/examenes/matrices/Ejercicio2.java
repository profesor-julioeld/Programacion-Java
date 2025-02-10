package examenes.matrices;

import java.util.Arrays;

public class Ejercicio2 {
    private final static int N=3;
    public static void main(String[] args) {
        int [][] matriz=creaMatriz(N);
        System.out.println(Arrays.deepToString(matriz));
        System.out.println(sumaMatriz(matriz));
    }

    private static int[][] creaMatriz(int n){
        int[][] aux=new int[N][];
        for (int i=0;i<aux.length;i++){
            aux[i]=new int[aleatorio(3,12)];
            for (int j=0;j<aux[i].length;j++)
                aux[i][j]=aleatorio(1,9);
        }
        return aux;
    }

    private static int sumaMatriz(int[][] matriz){
        int resultado=0;
        for(int[] array:matriz)
            for (int valor:array)
                resultado+=valor;
        return resultado;
    }

    private static int aleatorio(int M,int N){
        return (int) (Math.floor(Math.random()*(N-M+1)+M));
    }


}
