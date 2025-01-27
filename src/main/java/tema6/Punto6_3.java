package tema6;

public class Punto6_3 {
    public static void main(String[] args) {
        // Punto 6.3.1 Inicialización
        // Pasar de número a cadena
        int valor=1234;
        String cadena=String.valueOf(valor);
        System.out.println("cadena = " + cadena);
        // Pasar de cadena a número
        int valor2=Integer.parseInt(cadena);
        System.out.println("valor2 = " + valor2);
        // Punto 6.3.2 comparación
        /* Recuerda cuando podemos usar equals con objetos de una clase
        con String compara bien el contenido */
        String cadena2="Hola",cadena3="Hol"; // Pretendo fastidiar al optimizador
        cadena3+='a';
        System.out.println(cadena2==cadena3);
        System.out.println(cadena2.equals(cadena3));
        // Si compare dev 0 son iguales, si es + cadena2 es mayor
        System.out.println(cadena2.compareTo(cadena3));
        String cadena4="ñoño",cadena5="ono";
        // PROBLEMAS QUE DEBES CONOCER
        // La o va después de la ñ en Español pero según su codepoint no es así
        // SOLUCIÓN: En el programa OrdenacionSpain.java y documento Ordenación Alfabetica Español se soluciona
        System.out.println(cadena4.compareTo(cadena5));
        System.out.println((int)'ñ'-(int)'o');
        // Con acento y sin acento no son iguales
        String cadena6="arbol",cadena7="árbol";
        System.out.println(cadena6.equals(cadena7));
        // 6.3.4 Obtención de caracateres
        String s="1234567890";
        String recortao=s.substring(1,3); // comentar que fin realmente es fin -1
        System.out.println("recortao = " + recortao);
        // 6.3.9 Separación en partes
        String s2="sdsad,sfsdsd,sdsd,sdsdsd,sdsds";
        String[] as2=s2.split(","); // método muy interesante
        for (String v:as2)
            System.out.println("v = " + v);
    }
}
