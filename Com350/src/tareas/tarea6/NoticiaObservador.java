package tareas.tarea6;

public class NoticiaObservador extends Observador {
    private String nombreOb;

    public String nombreOb() {
        return nombreOb;
    }

    public NoticiaObservador(SubjectNoticia sujeto, String nombreOb) {
        this.sujeto =   sujeto;
        this.nombreOb = nombreOb;
        this.sujeto.agregar(this);
    }
    
    @Override
    public void actualizar() {
        System.out.println("Noticia: " + (sujeto.getNoticia()));
        System.out.println("Nombre:" + nombreOb());
    }
}