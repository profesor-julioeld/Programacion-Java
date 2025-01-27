package tema6;
// NOTA: Este contenido es avanzado para darlo ahora >>>

import java.text.Collator;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class OrdenacionSpain {

    public static void main(String[] args) {

        // Quito los acentos
        System.out.println(quitoAcentos("árbol"));
        // Comparación no sigue alfabeto Español
        String s="ñoño",d="oca";
        // El resultado debería ser negativo pero da positivo porque ñoño>oca
        System.out.println(s.compareTo(d));
        // Podemos probar
        String[] cadenas={"ñoño","oca"};
        // Ordeno de forma ascendente, no sigue el alfabeto Español
        Arrays.sort(cadenas);
        System.out.println(Arrays.toString(cadenas));
        // Ordenación siguiendo alfabeto Español
        // Primero instanciamos un Collator
        Collator comparador = Collator.getInstance(new Locale("es"));
        // Segundo tendremos que decir cómo se compara A,a y á
        // Tenemos varias opciones según el parámetro que pasemos
        // Ves cambiando el valor y observa los resultados
        //comparador.setStrength(Collator.PRIMARY);
        //comparador.setStrength(Collator.SECONDARY);
        //comparador.setStrength(Collator.TERTIARY);
        // Podemos comparar Sting usando el Collator creado
        String a1="álava",a2="alava",a3="Alava";
        System.out.println(comparador.compare(a1,a2));
        System.out.println(comparador.compare(a2,a3));
        System.out.println(comparador.compare(a1,a3));
        // Pero como vamos a ver mejor el efecto en usando sort
        String[] cadenas2={"Alava","álava","alava"};
        Arrays.sort(cadenas2,comparador);
        System.out.println(Arrays.toString(cadenas2));
        /* Aunque ésto de usar Arrays normalitos no es muy usual, se usan
        normalmente ArrayList ya que son dinámicos */
        List<String> aCadenas2= new ArrayList<String>();
        aCadenas2.add(a1);
        aCadenas2.add(a2);
        aCadenas2.add(a3);
        aCadenas2.sort(comparador); // Ordeno
        System.out.println(aCadenas2);
    }


    private static String quitoAcentos(String original) {
        String normalizada= Normalizer.normalize(original, Normalizer.Form.NFD);
        return normalizada.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
    }
}