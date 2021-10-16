package tareas.tarea4;

public interface IFabricaAbstracta {
    public IAves getIAve(String ave);
    public IMamiferos getIMamifero(String mamifero);
    public IPeces getIPez(String pez);
    
    public Mamiferos getMamifero(String mamifero);
}