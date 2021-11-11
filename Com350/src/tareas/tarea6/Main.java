package tareas.tarea6;

public class Main {
    public static void main(String[] args) {
        SubjectNoticia subject = new SubjectNoticia();
        
        new NoticiaObservador(subject,"Correo del Sur");
        new NoticiaObservador(subject,"El Potosi");
        
        System.out.println("Colocar la noticia del paro docente: ");
        subject.setNoticia("Debido al retraso de pagos");
    }
}