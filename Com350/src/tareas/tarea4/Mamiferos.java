package tareas.tarea4;


public abstract class Mamiferos extends Animal implements IMamiferos{
    private String nombre;
    private String temperatura;
    private int nrode_patas;
    private String Color;

    public Mamiferos() {super();}

    public Mamiferos(String nombre, String temperatura, int nrode_patas, String Color) {
        super();
        this.nombre = nombre;
        this.temperatura = temperatura;
        this.nrode_patas = nrode_patas;
        this.Color = Color;
    }

    @Override
    public String toString() {
        return "Mamiferos{" + "nombre=" + nombre + ", temperatura=" + temperatura + ", nrode_patas=" + nrode_patas + ", Color=" + Color + '}';
    }
    
    
    
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getTemperatura() {return temperatura;}
    public void setTemperatura(String temperatura) {this.temperatura = temperatura;}
    public int getNrode_patas() {return nrode_patas;}
    public void setNrode_patas(int nrode_patas) {this.nrode_patas = nrode_patas;}
    public String getColor() {return Color;}
    public void setColor(String Color) {this.Color = Color;}
}