import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author martin1
 */
public class Venta {

    private long idventa;
    private String cliente;
    private Calendar fechahora;
    private ArrayList<Abstractos> productos = new ArrayList<Abstractos>();

    public Venta(long idventa, String cliente) {
        super();
        this.idventa = idventa;
        this.cliente = cliente;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Calendar getFechahora() {
        return fechahora;
    }

    public void setFechahora(Calendar fechahora) {
        this.fechahora = fechahora;
    }

    public double getPrecio() {
        double precio = 0d;
        for (Abstractos hijo : productos) {
            precio +=hijo.getPrecio();
        }
        return precio;
    }

    public void addProducto(Abstractos producto) {
        productos.add(producto);
    }

    public void removeProducto(Abstractos producto) {
        productos.remove(producto);
    }

    public void imprimirVenta() {

        NumberFormat formater = new DecimalFormat("###,##0.00");
        System.out.println("        Orden "+ idventa                       );
        System.out.println("Cliente:" +cliente);
        System.out.println("Productos:");
        
        for (Object prod : productos) {
             Abstractos p=(Abstractos)prod;
            System.out.println(p.getNombre()+ " " + formater.format(p.getPrecio()));

        }
        System.out.println("Total: " + formater.format(getPrecio()) );
    }
}