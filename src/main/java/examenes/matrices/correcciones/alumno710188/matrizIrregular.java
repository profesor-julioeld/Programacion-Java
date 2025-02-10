package examenes.matrices.correcciones.alumno710188;

public class matrizIrregular {
    private final static int MAX=3;
    public static void main(String[] args) {
            //crea y rellena
            cyrMatriz();
            //suma e imprime
            imprimirMatriz(cyrMatriz());
        }

        private static String[][] cyrMatriz() {
            int matriz[][]=new int[MAX][(int) Math.floor(Math.random()*(12-3+1)+3)];
            int fmax= matriz.length;
            int cmax=0;
            for (int i=0;i<matriz.length;i++)
                for (int j=0;j<matriz[i].length-1;j++) {
                    int valorEntero = (int) (Math.floor(Math.random()*(9-1+1)+1));
                    //System.out.println(valorEntero);
                    matriz[i][j]=valorEntero;
                }
            String[][] resultado= new String[cmax][fmax];

            for (int i=0;i<matriz.length;i++){
                for (int j=0;j< matriz[i].length;j++) {
                    resultado[j][i]= Integer.toString(matriz[i][j]);
                }
            }
            return resultado;
        }



    private static void imprimirMatriz(String[][] arrayFinal){
        for (int i=0;i<arrayFinal.length;i++){
            for (int j=0;j<arrayFinal[i].length;j++){
                if (arrayFinal[i][j]==null) {
                    arrayFinal[i][j]=" ";
                }System.out.printf("[%1s]",arrayFinal[i][j]);
            }
            System.out.println();
        }
    }


}

