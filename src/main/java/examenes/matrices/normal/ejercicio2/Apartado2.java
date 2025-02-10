package examenes.matrices.normal.ejercicio2;

public class Apartado2 {
    public static void main(String[] args) {
        // Lo ideal es gestionar los errores por excepciones
        // por requerimiento lo hacemos por mensajes en out
        if (args.length!=3 || !esNum(args[0]) || !esOp(args[1]) || !esNum(args[2])){
            System.exit(-1);
        }
        int op1=Integer.parseInt(args[0]);
        char operador=args[1].charAt(0);
        int op2=Integer.parseInt(args[2]);
        switch (operador) {
            case '*'-> System.out.println(op1*op2);
            case '+'-> System.out.println(op1+op2);
            case '-'-> System.out.println(op1-op2);
        }
    }

    private static boolean esNum(String s){
        boolean bandera=true; // Asumo que es un número
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }

    private static boolean esOp(String s){
        if (s.length()!=1) return false;
        char c=s.charAt(0);
        return (c=='*' || c=='+' || c=='-');
    }
}
