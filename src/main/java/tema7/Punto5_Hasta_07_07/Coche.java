package tema7.Punto5_Hasta_07_07;

// EJERCICIO: Hay que definir esta clase copiando del comportamiento de Factura
// Coche entidad cuyas ocurrencias contienen
//    una matricula la forma 1234-GHJ
//    un numero de puertas
//    un numero de ruedas
// Qué se puede hacer
//   - Clase  estáticos
//   - Objeto dinámicos
//        Constructor sin parámetros (ruedas 4)
//        set numPuertas, Matricula
//        get numPuertas, Matricula, numRuedas
//        override toString()
public class Coche {
    private int numRuedas;
    private int numeroMatricula;
    private String numeroLetras;
    private int numPuertas;
    // Constructor

    public Coche() {
        this.numRuedas = 4;
    }

    // Métodos dinámicos setter/getter

    public int getNumRuedas() {
        return numRuedas;
    }

    public String getMatricula() {
        return String.format("%04d-%3s",numeroMatricula,numeroLetras);
    }

    // matricula 1234-FGH
    public void setMatricula(String matricula) {
        String[] lista=matricula.split("-");
        this.numeroMatricula=Integer.parseInt(lista[0]);
        this.numeroLetras=lista[1];
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "numRuedas=" + numRuedas +
                ", Matricula=" + getMatricula() +
                ", numPuertas=" + numPuertas +
                '}';
    }
}
