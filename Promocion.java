import java.time.LocalDate;

public class Promocion {
    private int idPromocion;
    private String descripcion;
    private double descuento;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Producto producto;

    public Promocion(int idPromocion, String descripcion, double descuento, LocalDate fechaInicio, LocalDate fechaFin, Producto producto) {
        this.idPromocion = idPromocion;
        this.descripcion = descripcion;
        this.descuento = descuento;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.producto = producto;
    }

    public double aplicarDescuento() {
        return producto.getPrecio() - (producto.getPrecio() * descuento / 100);
    }

    @Override
    public String toString() {
        return "Promocion ID: " + idPromocion +
               "\nDescripción: " + descripcion +
               "\nDescuento: " + descuento + "%" +
               "\nFecha de Inicio: " + fechaInicio +
               "\nFecha de Fin: " + fechaFin +
               "\nProducto: " + producto.getNombreProducto();
    }
}
