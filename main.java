import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){

        Usuario admin = new Usuario("admin","admin123","administrador");
        Usuario vendedor = new Usuario("vendedor1","vendedor123","vendedor");

        System.out.println("Sistema Verificando Contraseña");
        if (admin.VerificarPassword()){
            System.out.println("Contraseña correcta para el usuario: " + admin.getNombreUsuario());
        } else {
            System.out.println("Contraseña incorrecta para el usuario: " + admin.getNombreUsuario());
        }

        Producto P1 = new Producto(01,"Parlantes","Nuestros parlantes cuentan con un diseño elegante, que se adapta a cualquier espacio. Con una potencia adecuada y tecnología de última generación.",65.000,10);
        Producto P2 = new Producto(02,"Mouse Inhalambrico","Con un diseño compacto y ligero, es perfecto para llevarlo a cualquier lugar.",45.000,32);
        Producto P3 = new Producto(03,"Cautin"," Con su punta fina y calentamiento rápido, ofrece una alta precisión para unir componentes de manera eficiente y segura. ", 35.000,15);

        ArrayList<Producto> inventario = new ArrayList<>();
        inventario.add(P1);
        inventario.add(P2);
        inventario.add(P3);

        Venta v1 = new Venta(001);
        v1.agregarProducto(P1);
        v1.agregarProducto(P2);
        v1.agregarProducto(P3);

        Venta v2 = new Venta(002);
        v2.agregarProducto(P1);
        v2.agregarProducto(P2);

        Venta v3 = new Venta(003);
        v3.agregarProducto(P1);
        
        ArrayList<Venta> ventas = new ArrayList<>();
        ventas.add(v1);
        ventas.add(v2);
        ventas.add(v3);

        Informe informe = new Informe();
    
    
    boolean ejecutar= true;
    Scanner scanner = new Scanner(System.in);

    while (ejecutar){
        System.out.println(":::::::::::::::: Menu PPal ::::::::::::::::::::::::::::::");
        System.out.println("1. Ver inventario ");
        System.out.println("2. Realizar Venta");
        System.out.println("3. Generar informe de ventas");
        System.out.println("4. Generar informe de inventario");
        System.out.println("5. Salir!!!");
        System.out.println(" Selecciona una opcion ");
        int opcion = scanner.nextInt();

        switch (opcion){
            case 1: 
            System.out.println("&&&&&&&&&&&& Inventario &&&&&&&&&&&&&&&");
            for (Producto producto : inventario ){
                System.out.println(producto.toString());
            }
            break;

            case 2:
            System.out.println("Introduce el ID del producto a vender:");
            int idProducto = scanner.nextInt();
            Producto productoAVender = null;

            for (Producto producto : inventario ){
                if (producto.getId() == idProducto){
                    productoAVender=producto;
                    break;
                }

            }

            if (productoAVender != null && productoAVender.getCantidadStock() >0){
                Venta nuevaVenta = new Venta(ventas.size() + 1);
                nuevaVenta.agregarProducto(productoAVender);
                ventas.add(nuevaVenta);
                productoAVender.ajustarStock(-1);
                System.out.println("Venta Exitosa");

            } else {
                System.out.println("Producto no encontrado o sin Stock");

            }
            break;

            case 3:
            System.out.println("Generar informe de ventas");
            informe.generarInformeVentas(ventas);
            break;

            case 4:
            System.out.println("Generar informe de inventario");
            informe.generarInformeInventario(inventario);
            break;

            case 5:
            ejecutar= false;
            System.out.println("Saliendo del sistema");
            break;

            default:
            System.out.println("OPCION NO VALIDA, SELECCIONA UNA OPCION DEL 1 AL 5");
            break;


            }
        }

        scanner.close();


    }

}
