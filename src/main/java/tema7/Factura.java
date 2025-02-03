package tema7;

import java.util.Date;

// Esta clase la vamos a manejar de forma estática y dinámica
// no tendrá Main, la función principal irá en otra clase
public class Factura implements AutoCloseable{
    // ATRIBUTOS:
    // Atributos estáticos de la clase Factura
    private static int cuantas=0; // Para saber cuántas facturas se han creado
    private static int idMax=0; // Es el id más alto que se ha dado
    // Atributos dinámicos de una factura
    private int id;
    // Con estos tres campos implementaré el número de factura
    private char serie;
    private int numero;
    private String year;
    private Date fecha;
    private double total;
    // MÉTODOS:
    // Métodos dinámicos
    // El más importante, el constructor, se ejecuta con cada new
    public Factura(){
        // No es necesario en este caso poner Factura. ni this.
        // pero habrá ocasiones en las que sí lo sea
        Factura.cuantas++; // Creo una factura más
        Factura.idMax++; // id que le toca
        this.id=Factura.idMax;
    }
    // NOTA: Los getter y setter los creamos de forma automática
    // Usa de Generate (botón derecho)
    public int getId() {
        return id;
    }

    // El id se pone solo
    /*public void setId(int id) {
        this.id = id;
    }*/

    // Fuera de la clase sólo existe numFactura, dentro
    // lo guardo en tres atributos
    public String getNumFactura() {
        return year+"/"+serie+"/"+String.format("%05d",numero);
    }

    public void setNumFactura(String numFactura) {
        // No hago por ahora control de errores
        String[] trozitos=numFactura.split("/");
        year=trozitos[0];
        serie=trozitos[1].charAt(0);
        numero=Integer.parseInt(trozitos[2]);
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    // Métodos estáticos
    public static int getCuantas() {
        // Con ésto escondes la implementación de esa información
        return cuantas;
    }

    // No permito cambiar cuantas
    /*public static void setCuantas(int cuantas) {
        Factura.cuantas = cuantas;
    } */
    // Otro tipos de métodos (en este caso dinámicos)
    /* No usar esta solución porque no funciona
    @Override
    protected void finalize() throws Throwable {
        // Decremento el número de objetos factura
        Factura.cuantas--;
    } */
    // Este método lo creo con Generate
    @Override
    public String toString() {
        return "Factura{" +
                "id=" + id +
                ", numFactura=" + year+"/"+serie+"/"+numero +
                ", fecha=" + fecha +
                ", total=" + total +
                '}';
    }
    // Implemento el método close de AutoCloseable
    @Override
    public void close() throws Exception {
        Factura.cuantas--;
    }
}
