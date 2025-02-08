package tema7.Punto5_Hasta_07_07;
import java.util.Date;

public class UsoFactura {
    public static void main(String[] args) {
        // Comenta una de ellas y prueba
        usoFacturasSinClose();
        usoFacturasConClose();
    }

    private static void usoFacturasSinClose(){
        // Uso sin tener en cuenta Close, correcto si no tenemos close
        System.out.println("Nº facturas (paso1.1)="+Factura.getCuantas());
        Factura f1=new Factura();
        f1.setNumFactura("2025/A/3334");
        f1.setFecha(new Date());
        System.out.println("f1 = " + f1);
        System.out.println("Nº facturas (paso1.2)="+Factura.getCuantas());
        // Utilizo el otro constructor
        Factura f2=new Factura("2025/A/3334");
        f2.setFecha(new Date());
        System.out.println("f2 = " + f2);
        System.out.println("Nº facturas (paso1.3)="+Factura.getCuantas());
    }

    private static void usoFacturasConClose(){
        // Uso correcto si añadimos función close
        System.out.println("Nº facturas (paso2.1)="+Factura.getCuantas());
        try (Factura fc1=new Factura()) {
            fc1.setNumFactura("2025/A/1");
            fc1.setFecha(new Date());
            System.out.println("fc1 = " + fc1);
            System.out.println("Nº facturas (paso2.2)="+Factura.getCuantas());
        } catch (Exception e){};
        System.out.println("Nº facturas (paso2.3)="+Factura.getCuantas());
        try (Factura fc2=new Factura()) {
            fc2.setNumFactura("2025/A/34");
            fc2.setFecha(new Date());
            System.out.println("fc2 = " + fc2);
            System.out.println("Nº facturas (paso2.4)="+Factura.getCuantas());
        } catch (Exception e){};
        System.out.println("Nº facturas (paso2.5)="+Factura.getCuantas());
    }
}
