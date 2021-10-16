package tareas.tarea4;

import java.util.ArrayList;

public class Zoologico {
    private String nombre;
    private ArrayList<Jaula> lista_jaulas;
    private String direccion;
    private String telefono;
    private static Zoologico zoo = null;

    private Zoologico() {
        this.nombre = "Zoopas";
        this.lista_jaulas = new ArrayList<Jaula>();;
        this.direccion = "lejos";
        this.telefono = "666";
    }
    
    public static Zoologico getZoologico(){
        if(zoo == null)
            return zoo = new Zoologico();
        return zoo;
    }
    
    public void pushMamifero(Animal mamifero){
        Jaula jaula_mamifero = new Jaula(mamifero, 45f, 70f, 90f);
        lista_jaulas.add(jaula_mamifero);
        System.out.println("Mamifero ingresaso");
    }
    
    public void pushAve(Animal ave){
        Jaula jaula_ave = new Jaula( ave, 5f, 7f, 9f);
        lista_jaulas.add(jaula_ave);
        System.out.println("Ave ingresaso");
    }
    
    public void pushPez(Animal pez){
        Jaula jaula_pez = new Jaula( pez, 40f, 7f, 17f);
        lista_jaulas.add(jaula_pez);
        System.out.println("pez ingresaso");
    }
    
    public void seeMamifero(Animal x){
        System.out.println("Mamiferos");
        for (int i = 0; i < lista_jaulas.size(); i++){
            System.out.println(x.getClass().getSimpleName());
            if(x.getClass().getSimpleName().equals(lista_jaulas.get(i).getAnimal().getClass().getSimpleName()))                
                System.out.println(lista_jaulas.get(i).toString());
        }
    }
    
    public void seePez(Animal x){
        for (int i = 0; i < lista_jaulas.size(); i++) {
            if(x.getClass().equals(lista_jaulas.get(i).getClass()))
                System.out.println(lista_jaulas.get(i).toString());
        }
    }
    
    public void seeAve(Animal x){
        for (int i = 0; i < lista_jaulas.size(); i++) {
            if(x.getClass().equals(lista_jaulas.get(i).getClass()))
                System.out.println(lista_jaulas.get(i).toString());
        }
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public ArrayList<Jaula> getLista_jaulas() { return lista_jaulas; }
    public void setLista_jaulas(ArrayList<Jaula> lista_jaulas) { this.lista_jaulas = lista_jaulas;}
    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
    public String getTelefono() {return telefono;}
    public void setTelefono(String telefono) { this.telefono = telefono; }

    @Override
    public String toString() {
        return "Zoologico{" + "nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }
}