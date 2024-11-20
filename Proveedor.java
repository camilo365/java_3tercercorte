import java.util.ArrayList;
public class Proveedor {
        private int idProveedor;
        private String nombreProveedor;
        private String direccion;
        private String telefono;
        private ArrayList<Producto> productos;
    
        public Proveedor(int idProveedor, String nombreProveedor, String direccion, String telefono) {
            this.idProveedor = idProveedor;
            this.nombreProveedor = nombreProveedor;
            this.direccion = direccion;
            this.telefono = telefono;
            this.productos = new ArrayList<>();
        }
    
        public int getIdProveedor() {
            return idProveedor;
        }
    
        public void setIdProveedor(int idProveedor) {
            this.idProveedor = idProveedor;
        }
    
        public String getNombreProveedor() {
            return nombreProveedor;
        }
    
        public void setNombreProveedor(String nombreProveedor) {
            this.nombreProveedor = nombreProveedor;
        }
    
        public String getDireccion() {
            return direccion;
        }
    
        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }
    
        public String getTelefono() {
            return telefono;
        }
    
        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }
    
        public ArrayList<Producto> getProductos() {
            return productos;
        }
    
        public void asociarProducto(Producto producto) {
            productos.add(producto);
        }
    
        public void eliminarProducto(Producto producto) {
            productos.remove(producto);
        }
    
        @Override
        public String toString() {
            return "Proveedor ID: " + idProveedor +
                   "\nNombre: " + nombreProveedor +
                   "\nDirección: " + direccion +
                   "\nTeléfono: " + telefono +
                   "\nProductos asociados: " + productos.size();
        }
}
