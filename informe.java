import java.util.ArrayList;
public class Informe {
    public void generarInformeVentas(ArrayList<Venta>ventas){
        System.out.println("********** Informe De Ventas************");
        for (Venta venta : ventas){
            System.out.println(venta.toString());
        }

        System.out.println("**********************************");
    }
  
    public void generarInformeInventario(ArrayList<Producto>productos){
        System.out.println("*************  Informe De Inventario *****************");
        for (Producto producto : productos){
            System.out.println(producto.toString());
        }

        System.out.println("**********************************");
    }
}
