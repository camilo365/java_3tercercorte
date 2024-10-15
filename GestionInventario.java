import java.util.ArrayList;
import java.util.Scanner;

public class GestionInventario{
    private ArrayList<Producto> inventario;

    public GestionInventario(){

        this.inventario = new ArrayList<>();

    }

    public void agregarProducto(Scanner scanner){
        System.out.println("Agregar Nuevo Producto");

        System.out.print(" Dame el ID del producto: ");
        int idProducto = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Dame el nombre del producto");
        String nombreProducto = scanner.nextLine();

        System.out.print("Dame la descripcion del producto");
        String descripcion = scanner.nextLine();

        System.out.print("Dame el precio del producto");
        double precio = scanner.nextDouble();

        System.out.print("Dame la cantidad en stock del producto");
        int cantidadStock = scanner.nextInt();

        Producto nuevoProducto = new Producto(idProducto,nombreProducto,descripcion,precio,cantidadStock);
        inventario.add(nuevoProducto);

        System.out.println("Producto agregado exitosamente");
        System.out.println(nuevoProducto);

    }

    public void eliminarProducto(Scanner scanner){
        System.out.println("--------- Eliminar Producto-------------------");

        System.out.print("Introduce el ID del producto que deseas eliminar");
        int idProducto = scanner.nextInt();

        Producto productoAEliminar = null;
        for (Producto producto: inventario){
            if (producto.getId() == idProducto){
                productoAEliminar = producto;
                break;
            }
        }

        if (productoAEliminar != null){
            inventario.remove(productoAEliminar);
            System.out.println("Producto eliminado con exito");
            System.out.println(productoAEliminar);
        } else {
            System.out.println("Producto no encontrado");
        }

    }

    public void modificarProducto(Scanner scanner){
        System.out.println("------------------------Modificar Producto------------------");

        System.out.print("Dame el ID del producto que quieres modificar");
        int idProducto = scanner.nextInt();
        scanner.nextLine();

        Producto productoAModificar = null;
        for (Producto producto : inventario){
            if (producto.getId() == idProducto){
                productoAModificar = producto;
                break;
            }
        }

        if(productoAModificar != null){
            System.out.println("Producto encontrado : " + productoAModificar);
        }
        System.out.print("Introduce el nuevo nombre (Si no lo quieres cambiar deja vacio este campo)");
        String nuevoNombre = scanner.nextLine();
        if (!nuevoNombre.isEmpty()) {
            productoAModificar.setNombreProducto(nuevoNombre);
        }

        System.out.print("Introduce la nueva descripción (deja vacío si no deseas cambiarla): ");
        String nuevaDescripcion = scanner.nextLine();
        if (!nuevaDescripcion.isEmpty()) {
            productoAModificar.setDescripcion(nuevaDescripcion);
        }

        System.out.print("Introduce el nuevo precio (deja 0 si no deseas cambiarlo): ");
        double nuevoPrecio = scanner.nextDouble();
        if (nuevoPrecio > 0) {
            productoAModificar.setPrecio(nuevoPrecio);
        }

        System.out.print("Introduce la nueva cantidad en stock (deja -1 si no deseas cambiarla): ");
        int nuevaCantidadStock = scanner.nextInt();
        if (nuevaCantidadStock >= 0) {
            productoAModificar.setCantidadStock(nuevaCantidadStock);
        }

        System.out.println("Producto modificado exitosamente:");
        System.out.println(productoAModificar);
    }

}



