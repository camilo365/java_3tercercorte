import java.time.LocalDateTime;
import java.util.ArrayList;

public class Venta {
    private int idVenta;
    private ArrayList<String> productosVendidos;
    private double totalVenta;
    private LocalDateTime fechaHora;

    public Venta(int idVenta){
        this.idVenta=idVenta;
        this.productosVendidos=new ArrayList<>();
        this.fechaHora=LocalDateTime.now();

    }
    
    public int getIdVenta(){
        return idVenta;
    }

    public void setIdVenta(int idVenta){
        this.idVenta = idVenta;
    }

    public ArrayList<String> getProductosVendidos(){
        return productosVendidos;
    }

    public void setProductosVendidos(ArrayList<String> productosVendidos){
        this.productosVendidos = productosVendidos;
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



}
