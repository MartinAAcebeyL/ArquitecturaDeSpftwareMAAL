package tareas.tarea5;

public class PilaA implements IPila{

    @Override
    public void insertar(Pila pila, int x){
        pila.getArray()[pila.getTope()] = x;
        System.out.println("insercion echa");
        pila.setTope(pila.getTope()+1);
    }
    
    @Override
    public void eliminar(Pila pila){
        pila.getArray()[pila.getTope()] = 0;
        System.out.println("eliminacion echa");
        pila.setTope(pila.getTope()-1);
    }

    @Override
    public void mostrar(Pila pila){
        for (int i = 0; i < pila.getTope(); i++)
            System.out.println((i+1)+"} valor: "+pila.getArray()[i]);
    }
}
