package tema7;

import java.util.Scanner;

public class EjemploAutoCloseable {
    public static void main(String[] args) {
        // No uso Autoclosable
        Scanner sc = null;
        try {
            sc = new Scanner(System.in);
            // Cuando pida un entero escribe un literal
            System.out.println(" Escribe un número ");
            int i = sc.nextInt();
            System.out.println("i = " + i);
            // Ya no tengo más que hacer por lo que cierro el recurso
        } catch (RuntimeException e) {
            // Imprimo el error o lo que proceda
            e.printStackTrace();
        } finally {
            if (sc != null) sc.close();
            System.out.println(" Acabo de cerrar el recurso");
        }
        // Uso Autocloseable
        try (Scanner sc2 = new Scanner(System.in)) {
            // Cuando pida un entero escribe un literal
            System.out.println(" Escribe un número ");
            int i = sc2.nextInt();
            System.out.println("i = " + i);
            // Ya no tengo más que hacer por lo que cierro el recurso
        } catch (RuntimeException e) {
            // Imprimo el error o lo que proceda
            e.printStackTrace();
        } finally {
            System.out.println(" Acabo de cerrar el recurso");
        }
    }
}
