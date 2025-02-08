package examenes.matrices.anulado.correcciones.alumno561212;

public class Suma {
    public static void main(String[] args) {
        int num=0;
        int suma=0;
        char aux;
        for (String par:args){
            for (int i=(par.length()-1),j=(0) ;i>=0;i--){
                aux=par.charAt(i);
                if (Character.isDigit(aux)){
                    num=Character.getNumericValue(aux);
                    suma+= (int) (Math.pow(10,j)*num);
                    j++;
                }
            }
        }
        System.out.println(suma);
    }
}
