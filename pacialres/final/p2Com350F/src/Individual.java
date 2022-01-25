/**
 *
 * @author martin1
 */
public class Individual extends Abstractos {

    public Individual(String nombre, double precio) {
        super(nombre, precio);
    }
    
    public String getNombre(){
        return this.nombre;
    }
    @Override
    public double getPrecio() {
        return this.precio;
    }
}
