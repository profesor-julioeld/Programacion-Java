package examenes.matrices.correcciones.alumno710188;

public class Suma {
    /* Este código solo funciona si se pasan parámetros de enteros.
    Faltaría un if para que solamente cogiera los enteros.
    Ahora mismo, salta error si un parámetro es un character o una palabra
     */
    public static void main(String[] args) {
        int suma=0;
        for (String par:args) {
            suma+=Integer.parseInt(par);
        }
        //Le he quitado el texto de "Suma total de parámetros"
        //para que sea el ejercicio pedido literalmente
        System.out.println(suma);
    }
}
