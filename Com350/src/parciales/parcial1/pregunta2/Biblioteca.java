package parciales.parcial1.pregunta2;

import java.util.ArrayList;

/*

tiene los atributos: nombre
=”Biblioteca Tecnología”, Direccion =” Regimiento Campos 6 de Infanteria, Sucre”
teléfono=” 46456515” y una lista de publicación.*/

public class Biblioteca {
    private static Biblioteca instance;
    private String nombre;
    private String direccion;
    private String telefono;
    private ArrayList<Publicaciones> lista_publicaciones;
    //

    public ArrayList<Publicaciones> getLista_publicaciones() {
        return lista_publicaciones;
    }

    public void setLista_publicaciones(ArrayList<Publicaciones> lista_publicaciones) {
        this.lista_publicaciones = lista_publicaciones;
    }
    
    
    private Biblioteca() {
        this.nombre = "Biblioteca tecnologia";
        this.direccion = "Regimiento campos 6 de infanteria, Sucre";
        this.telefono = "464546";
        this.lista_publicaciones = new ArrayList();
    }

    public void agregar_publicacion(Publicaciones p){
        this.lista_publicaciones.add(p);
    }
    
    public  static Biblioteca getInstance()
    {
        if (instance==null)    
            instance=new Biblioteca();
       return instance; 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Biblioteca{" + "nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }

    
}
