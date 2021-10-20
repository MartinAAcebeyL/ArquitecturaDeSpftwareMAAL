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
public class Periodico extends Publicaciones{
    private String fecha;

    public Periodico(String titulo) {
        super(titulo);
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    @Override
    public String toString() {
        return "soy un periodico con titulo: " + super.getTitulo();
    }
 
    
    
}
