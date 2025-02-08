package examenes.matrices.anulado.correcciones.alumno561212;

import java.util.Random;

public class Matriz {

    public static int N=3;

    public static void main(String[] args) {
        int a[][]=crea();
        int b=suma(a);
        System.out.println(b);
    }

    public static int[][] crea(){
        int matriz[][]=new int [N][];
        Random r = new Random();


        for (int i=0; i<matriz.length;i++){
            int valorEntero = r.nextInt(9)+3;
            matriz[i]=new int [valorEntero];
        }
        for (int i=0;i<matriz.length;i++) {
            for (int j=0;j<matriz[i].length;j++){
                int valoraleatorio=r.nextInt(8)+1;
                matriz[i][j]=valoraleatorio;
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matriz[i].length; j++) System.out.print(matriz[i][j]+" ");

            System.out.println("]");
        }
        System.out.println();
        return matriz;
    }

    public static int suma(int aux[][]){
        int suma2=0;
        for (int i=0;i<aux.length;i++) {
            for (int j=0;j<aux[i].length;j++){
                suma2+=aux[i][j];
            }
        }
        return suma2;
    }


}
