/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parciales.parcial1.pregunta2;

/**
 *
 * @author martin1
 */
public class Libro extends Publicaciones{
    private String editorial;
    private int anio;

    public Libro(String titulo) {
        super(titulo);
    }
    
    public Libro(String editorial, int anio, String titulo) {
        super(titulo);
        this.editorial = editorial;
        this.anio = anio;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "sou un ibro con titulo: " + super.getTitulo();
    }

    
    
    
}
