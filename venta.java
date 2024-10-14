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
    
}
