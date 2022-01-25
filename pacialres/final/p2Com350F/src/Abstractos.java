/**
 *
 * @author martin1
 */
public abstract class Abstractos {
    protected String nombre;
    protected double precio;

    public Abstractos(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public abstract double getPrecio();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }   
}