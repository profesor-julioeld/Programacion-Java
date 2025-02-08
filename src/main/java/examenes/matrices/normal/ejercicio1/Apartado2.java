package examenes.matrices.normal.ejercicio1;

import java.util.Arrays;

public class Apartado2 {
    public static void main(String[] args) {
        int[] cuantos={3,4,-1,6,3,2,1};
        char[] caracteres ={'A','B','C','D'};
        String[] resultado=repite(cuantos, caracteres);
        System.out.println(Arrays.toString(resultado));
    }
    private static String[] repite(int[] cuantos,char[] caracteres){
        if (cuantos==null || caracteres==null ) return null;
        String[] resultado=new String[Math.min(caracteres.length,cuantos.length)];
        for (int i=0;i<resultado.length;i++){
            if (cuantos[i]<=0) {
                resultado[i]="";
                continue;
            }
            resultado[i]= cadena(cuantos[i],caracteres[i]);
        }
        return resultado;
    }
    private static String cadena(int cuanto,char caracter){
        StringBuilder s=new StringBuilder();
        for (int i=0;i<cuanto;i++) s.append(caracter);
        return s.toString();
    }
}
