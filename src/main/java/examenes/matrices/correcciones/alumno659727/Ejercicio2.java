package examenes.matrices.correcciones.alumno659727;

import java.util.Arrays;

public class Ejercicio2 {
    final static int N=4;
    public static void main(String[] args) {
    int maxC=12;
    int [] [] array=new int[N][maxC];
    int [][] arrayLleno=llenar(array);
    int sumatorio=sumar(arrayLleno);
    //La matriz no se imprime bien visualmente, no tiene estructura de matriz y además imprime los 0
    //que corresponden a las posiciones vacias, una solucion podria ser dividirlo en substrings e imprimir
    //los 0 como espacios en blanco ya que no forman parte de los numeros que pueden rellenar la matriz
    //System.out.println(Arrays.deepToString(Array);
    //Esto soluciona el problema de la forma pero todavía no soluciona los 0.
        String matriz = Arrays.deepToString(array);
        String [] imprimeBien=matriz.split("],");
        for (String v:imprimeBien)
            System.out.println(v);
        System.out.print("sumatorio = " + sumatorio );

    }

    private static int [][] llenar(int [][] array){
        for (int i = 0; i < N; i++) {
            int columna=(int)(Math.floor(Math.random()*(3-12+1)+12));
            for (int j=0;j<columna;j++){
                array [i] [j]= (int)(Math.floor(Math.random()*(1-9+1)+9));
            }

        }
        return array;
    }

    private static int sumar(int[][]array){
        int sumatorio=0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sumatorio += array[i][j];
            }
        }
           return sumatorio;
            }

        }
