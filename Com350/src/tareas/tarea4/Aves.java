package tareas.tarea4;

public abstract class Aves extends Animal implements IAves{
    private String nombre;
    private Float tamano_alas;
    private int peso;

    public Aves() {super(); }

    public Aves(String nombre, Float tamano_alas, int peso) {
        super();
        this.nombre = nombre;
        this.tamano_alas = tamano_alas;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getTamano_alas() {
        return tamano_alas;
    }

    public void setTamano_alas(Float tamano_alas) {
        this.tamano_alas = tamano_alas;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Aves{" + "nombre=" + nombre + ", tamano_alas=" + tamano_alas + ", peso=" + peso + '}';
    }
    
    
    
}