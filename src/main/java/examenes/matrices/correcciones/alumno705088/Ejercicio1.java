package examenes.matrices.correcciones.alumno705088;

/*
He puesto un metodo de bandera, y para el isDigit he puesto caracter. para borrar
el sb he puesto delete.
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int suma = 0;
        boolean flag = false;
        for(int i=0;i<args.length;i++) {
            flag = false;
            sb.delete(0,sb.length());
            for(int j=0;j<args[i].length();j++){
                char aux = args[i].charAt(j);
                if(Character.isDigit(aux)) {
                    sb.append(aux);
                    flag = true;
                }
            }
            //sin reverse
            if(flag)
                suma+= Integer.parseInt(sb.toString());
        }
        System.out.println("suma = " + suma);
    }
}
