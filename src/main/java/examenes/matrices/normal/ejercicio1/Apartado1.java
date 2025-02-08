package examenes.matrices.normal.ejercicio1;

import java.util.Arrays;

public class Apartado1 {
    public static void main(String[] args) {
        int[] izda={3,4,5,6,3,2,1};
        int[] dcha={7,8,10,12,34};
        int[] resultado=mezcla(izda,dcha);
        System.out.println(Arrays.toString(resultado));
    }
    private static int[] mezcla(int[] izda,int[] dcha){
        if (izda==null || dcha==null ) return null;
        int[] resultado=new int[izda.length+dcha.length];
        for (int i=0,j=0;i<Math.max(izda.length,dcha.length);i++){
            if (i<izda.length) resultado[j++]=izda[i];
            if (i<dcha.length) resultado[j++]=dcha[i];
        }
        return resultado;
    }
}
