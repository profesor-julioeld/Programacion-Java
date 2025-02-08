package tema7.Punto5_Hasta_07_07;

import java.util.Date;

// Esta clase la vamos a manejar de forma estática y dinámica
// no tendrá Main, la función principal irá en otra clase
// Las variables de la clase son globales y se denominan ATRIBUTOS
// Las funciones de la clase se denominan MÉTODOS
// Tanto ATRIBUTOS como MÉTODOS se los denomina MIEMBROS de la clase

public class Factura implements AutoCloseable{
    // ATRIBUTOS:
    // Atributos estáticos de la clase Factura, una sola copia para todos los objetos
    private static int cuantas=0; // Para saber cuántas facturas están activas
    private static int idMax=0; // Es el id más alto que se ha dado
    // Atributos dinámicos de una factura
    // MOD: 08-02-25 Cambio a final para no permitir su modificación una vez creado el objeto
    // Al ser final, puedo inicializarlo aquí pero también se permite en el constructor
    private final int id;
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
        this.id=Factura.idMax; // MI: Aunque es final, en el constructor se puede inicializar
    }
    // MOD: 08-02-25 Añado sobrecarga al constructor y uso de this()
    public Factura(String matricula){
        this(); // MI: Se pone sí o sí en la primera línea de código
        this.setNumFactura(matricula);
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

    // MI: Uso de this para hacer referencia al atributo y no al parámetro formal
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
    // Este método lo creo con Generate pero retoco un poco
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
