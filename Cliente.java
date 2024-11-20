import java.util.ArrayList;

public class Cliente {
    private int idCliente;
    private String nombre;
    private String email;
    private String direccion;
    private ArrayList<Venta> ventas;
    private int puntosFidelidad;

    public Cliente(int idCliente, String nombre, String email, String direccion) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
        this.ventas = new ArrayList<>();
        this.puntosFidelidad = 0;
    }

    public void agregarVenta(Venta venta) {
        ventas.add(venta);
        asignarPuntosFidelidad(venta.getTotalVenta());
    }

    public void asignarPuntosFidelidad(double montoCompra) {
        int puntos = (int) (montoCompra / 10);
        puntosFidelidad += puntos;
    }

    public void canjearPuntos(int puntos) {
        if (puntos <= puntosFidelidad) {
            puntosFidelidad -= puntos;
        } else {
            System.out.println("Puntos insuficientes.");
        }
    }

    @Override
    public String toString() {
        return "Cliente ID: " + idCliente +
               "\nNombre: " + nombre +
               "\nEmail: " + email +
               "\nDirección: " + direccion +
               "\nPuntos de Fidelidad: " + puntosFidelidad +
               "\nVentas: " + ventas.size();
    }
}