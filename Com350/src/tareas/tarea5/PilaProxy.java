package tareas.tarea5;

import java.util.logging.Logger;

public class PilaProxy implements IPila{
    private IPila pila;
    private final static Logger LOGGER = Logger.getLogger(PilaProxy.class.getName());
    
    public PilaProxy(IPila pila){
        this.pila = pila;
    }
    
    @Override
    public void insertar(Pila pilap, int x){
        LOGGER.info("----pila Proxy - insertar----");      
        pila.insertar(pilap, x);
    }
    
    @Override
    public void eliminar(Pila pilap){
        LOGGER.info("----pila Proxy - eliminar----");
        pila.eliminar(pilap);
    }

    @Override
    public void mostrar(Pila pilap){
        LOGGER.info("----pila Proxy - mostrar----");
        pila.mostrar(pilap);
    }
}