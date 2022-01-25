import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author martin1
 * */

public class Combos extends Abstractos {

    private List< Abstractos > combos = new ArrayList< Abstractos>();
    private double descuento;

    
    public Combos(String nombre, double descuento) {
        super(nombre, 0);
        this.descuento = descuento;
    }

    @Override
    public double getPrecio() {
        double precio = 0;
        for (Abstractos hijo : combos) {
            precio += hijo.getPrecio();
        }
        return precio-descuento;
    }

    @Override
    public void setPrecio(double price) {
        double precio = 0;
        for (Abstractos hijo : combos) {
            precio += hijo.getPrecio();
        }
        this.precio=precio;
        
    }

    public void agregar_producto(Abstractos producto) {
        this.combos.add(producto);
    }

    public boolean remover_producto(Abstractos producto) {
        return this.combos.remove(producto);
    }
}