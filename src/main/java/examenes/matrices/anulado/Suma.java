package examenes.matrices.anulado;

public class Suma {
    public static void main(String[] args) {
        int resultado=0;
        for(String valor:args)
            resultado+=calculaEntero(valor);
        System.out.println(resultado);
    }

    private static int calculaEntero(String s){
        int potencia=1;
        int resultado=0;
        for (int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            if (Character.isDigit(c)){
                int valor=Character.getNumericValue(c);
                resultado+=valor*potencia;
                potencia*=10;
            }
        }
        return resultado;
    }
}
