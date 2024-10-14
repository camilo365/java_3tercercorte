import java.time.LocalDateTime;
import java.util.ArrayList;

public class Venta {
    private int idVenta;
    private ArrayList<Producto> productosVendidos;
    private double totalVenta;
    private LocalDateTime fechaHora;

    public Venta(int idVenta){
        this.idVenta=idVenta;
        this.productosVendidos=new ArrayList<>();
        this.fechaHora=LocalDateTime.now();
        this.totalVenta=0.0;

    }
    
    public int getIdVenta(){
        return idVenta;
    }

    public void setIdVenta(int idVenta){
        this.idVenta = idVenta;
    }

    public ArrayList<Producto> getProductosVendidos(){
        return productosVendidos;
    }

    public void setProductosVendidos(ArrayList<Producto> productosVendidos){
        this.productosVendidos = productosVendidos;
        calcularTotalVenta();
    }

    public double getTotalVenta(){
        return totalVenta;
    }

    public void setTotalVenta(double totalVenta){
        this.totalVenta = totalVenta;
    }

    public LocalDateTime getFechaHora(){
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora){
        this.fechaHora = fechaHora;
    }

    public void agregarProducto(Producto producto){
        productosVendidos.add(producto);
        calcularTotalVenta();
    }

    private void calcularTotalVenta(){
        totalVenta=0.0;
        for(Producto producto: productosVendidos){
            totalVenta+=producto.getPrecio();
        }
    }

    @Override
    public String toString() {
        return "Producto [ÍDVenta = " + idVenta + ", Valor Total Venta = " + totalVenta + ", Fecha y Hora = " + fechaHora +  "]";

    }




}
