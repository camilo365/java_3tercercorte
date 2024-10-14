public class Producto {
    private int id;
    private String nombreProducto;
    private String descripcion;
    private double precio;
    private int cantidadStock;

    public Producto(int id,String nombreProducto,String descripcion,double precio,int cantidadStock){
        this.id=id;
        this.nombreProducto=nombreProducto;
        this.descripcion=descripcion;
        this.precio=precio;
        this.cantidadStock=cantidadStock;

    }
    
}