import org.apache.pdfbox.pdmodel.*;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

public class GenerarFactura {
    public static void generarFactura(Venta venta, Cliente cliente) {
        PDDocument document = new PDDocument();
        try {
            PDPage page = new PDPage();
            document.addPage(page);
            PDPageContentStream contentStream = new PDPageContentStream(document, page);
            contentStream.setFont(PDType1Font.HELVETICA_BOLD, 12);
            contentStream.beginText();
            contentStream.newLineAtOffset(50, 750);  // Coordenadas en la página (x, y)
            contentStream.showText("Factura: Tienda Electrónica");
            contentStream.newLine();
            contentStream.showText("Fecha: " + LocalDate.now());
            contentStream.newLine();
            contentStream.showText("Cliente: " + cliente.getNombre());
            contentStream.newLine();
            contentStream.newLine();
            contentStream.showText("Producto\tPrecio\tCantidad\tTotal");
            contentStream.newLine();
            
            for (Producto producto : venta.getProductosVendidos()) {
                contentStream.showText(producto.getNombreProducto() + "\t" + "$" + producto.getPrecio() + "\t" + "1" + "\t" + "$" + producto.getPrecio());
                contentStream.newLine();
            }
            contentStream.newLine();
            contentStream.showText("Total: $" + venta.getTotalVenta());
            contentStream.endText();
            contentStream.close();
            document.save("factura_" + venta.getIdVenta() + ".pdf");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                // Cerrar el documento
                document.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
