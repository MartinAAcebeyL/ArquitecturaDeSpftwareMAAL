package parciales.parcial1.pregunta2;

public class Revista extends Publicaciones{
       private int anio,mes;

     public Revista(String titulo) {
        super(titulo);
    }
       
    public Revista(int anio, int mes, String titulo) {
        super(titulo);
        this.anio = anio;
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
    
    @Override
    public String toString() {
        return "sou una revista con titulo: " + super.getTitulo();
    }
}
