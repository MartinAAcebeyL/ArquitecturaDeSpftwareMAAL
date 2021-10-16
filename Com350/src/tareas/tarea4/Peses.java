package tareas.tarea4;

public abstract class Peses extends Animal implements IPeces{
    private String nombre;
    private Float longitud;

    public Peses() {super();}

    public Peses(String nombre, Float longitud) {
        super();
        this.nombre = nombre;
        this.longitud = longitud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getLongitud() {
        return longitud;
    }

    public void setLongitud(Float longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Peses{" + "nombre=" + nombre + ", longitud=" + longitud + '}';
    }
    
    
}