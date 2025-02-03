package tema7;

import java.util.Date;

public class usoFactura {
    public static void main(String[] args) {
        try (Factura f=new Factura()) {
            f.setNumFactura("2025/A/1");
            f.setFecha(new Date());
            System.out.println("f = " + f);
            System.out.println("Nº facturas (paso1)="+Factura.getCuantas());
        } catch (Exception e){};
        System.out.println("Nº facturas (paso2)="+Factura.getCuantas());
        try (Factura f2=new Factura()) {
            f2.setNumFactura("2025/A/34");
            f2.setFecha(new Date());
            System.out.println("f2 = " + f2);
            System.out.println("Nº facturas (paso3)="+Factura.getCuantas());
        } catch (Exception e){};
        System.out.println("Nº facturas (paso4)="+Factura.getCuantas());
        Factura f3=new Factura();
        f3.setNumFactura("2025/A/3334");
        f3.setFecha(new Date());
        System.out.println("f3 = " + f3);
    }
}
