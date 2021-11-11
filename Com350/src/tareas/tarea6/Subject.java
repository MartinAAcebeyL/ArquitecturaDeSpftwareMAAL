package tareas.tarea6;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observador> observadores = new ArrayList<Observador>();
    
    public void agregar(Observador observador) {
        observadores.add(observador);
    }
    
    public void eliminar(Observador observador) {
	observadores.remove(observador);
    }

    public void notificarObservadores() {
	observadores.forEach(x -> x.actualizar());
    }
}