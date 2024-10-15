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
    
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNombreProducto(){
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto){
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public double getPrecio(){
        return precio;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public int getCantidadStock(){
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock){
        this.cantidadStock = cantidadStock;
    }

    public void ajustarStock(int cantidad){
        if (cantidadStock + cantidad >= 0 ) {
            cantidadStock += cantidad;
        } else {
            System.out.println("No puedes restar" + cantidad + " unidades, stock induficiente");
        }
    }

    @Override
    public String toString() {
        return "Producto: " + nombreProducto + 
               "\nDescripción: " + descripcion + 
               "\nCantidad en Stock: " + cantidadStock + 
               "\nPrecio: $" + precio + "\n";

        }


}

