package examenes.matrices.correcciones.alumno707558;

public class Alumno707558 {
    public final static int F=4;
    public final static int M=3;
    public final static int N=12;
    public final static int C=(int) (Math.floor(Math.random()*(N-M-1)+M));;
    public static void main(String[] args) {
        int [][] matriz = new int[F][C];
        relleno(matriz);
        calculo(matriz);
        imprime(matriz);
    }

    private static void relleno (int [][] matriz){
        for (int i = 0; i < F-1; i++) {
            for (int j = 0; j < C-1; j++) {
                int M=1;
                int N=9;
                int valorEntero= (int) (Math.floor(Math.random()*(N-M+1)-M));
                matriz[i][j]=valorEntero;
            }
        }
    }
    private static void calculo (int [][] matriz){
        int total=0;
        int i=0,j=0;
        for (i = 0; i < F-1; i++) {
            int SumaFila=0, SumaColumna=0;
            for (j = 0;j < C-1;j ++) {
                SumaFila+=matriz[i][j];
                SumaColumna+=matriz[j][i];
            }
            matriz[i][j]=SumaFila;
            matriz[j][i]=SumaColumna;
            total+=SumaFila;
        }
        matriz[i][j]=total;
    }
    private static void imprime (int [][] matriz){
        for (int i = 0; i < F; i++) {
            for (int j = 0; j < C; j++) {
                System.out.printf("%3d", matriz[i][j]);

            }
            System.out.println();
        }
    }
}
