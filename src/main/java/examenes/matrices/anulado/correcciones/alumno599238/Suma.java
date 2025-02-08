package examenes.matrices.anulado.correcciones.alumno599238;

public class Suma {
    private static int suma(String args[]){

        int Suma=0;
        for (int i=0;i<args.length;i++){
            StringBuilder sb= new StringBuilder("");

            for(int j=0;j<args[i].length();j++){
                if(Character.isDigit(args[i].charAt(j))){
                    sb.append(args[i].charAt(j));
                }
            }

            Suma=Suma+Integer.parseInt(String.valueOf(sb));

        }
        return Suma;
    }
    public static void main(String[] args) {
        int total=suma(args);
        System.out.println(total);

    }
}
