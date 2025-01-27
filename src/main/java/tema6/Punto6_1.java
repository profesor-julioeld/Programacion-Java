package tema6;

public class Punto6_1 {
    public static void main(String[] args) {
        // Punto 6.1.1 Unicode
        char c1='a',c2=97,c3='\u0061';
        // Contienen el mismo carácter
        System.out.println(c1+""+c2+""+c3);
        char c4='\u2661'; // No reproducible con teclado
        System.out.println(c4);
        // Punto 6.1.2 Secuencias de escape
        // Creo una cadena con una ruta, cuidado con las secuencias de escape
        String cadenaMal="d:\todo\nueve";
        String cadenaBien1="d:\\todo\\nueve";
        String cadenaBien2="d:/todo/nueve";
        // Recuerda usar sout y tabulador para autorellenar
        System.out.println(cadenaMal);
        System.out.println(cadenaBien1);
        System.out.println(cadenaBien2);
        // Punto 6.1.3 char - int
        int codepoint=97;
        char c5;
        // c5=codepoint; // Error
        c5=(char)codepoint;
        codepoint=c5; // sin problemas
    }
}
