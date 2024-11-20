import com.github.javafaker.Faker;
import java.util.ArrayList;

public class GeneradorDatos {

    public static ArrayList<Usuario> generarUsuarios(int cantidad) {
        Faker faker = new Faker();
        ArrayList<Usuario> usuarios = new ArrayList<>();

        for (int i = 0; i < cantidad; i++) {
            String usuario = faker.name().username();
            String email = faker.internet().emailAddress();
            String direccion = faker.address().streetAddress();
            usuarios.add(new Usuario(usuario, email, direccion));
        }

        return usuarios;
    }

    public static ArrayList<Producto> generarProductos(int cantidad) {
        Faker faker = new Faker();
        ArrayList<Producto> productos = new ArrayList<>();

        for (int i = 0; i < cantidad; i++) {
            String nombreProducto = faker.commerce().productName();
            double precio = faker.number().randomDouble(2, 5, 1000);
            int cantidadStock = faker.number().numberBetween(1, 100);
            productos.add(new Producto(i + 1, nombreProducto, "Descripción aleatoria", precio, cantidadStock));
        }

        return productos;
    }
}
