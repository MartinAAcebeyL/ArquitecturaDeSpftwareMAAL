/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsability;

/**
 *
 * @author Carlos
 */
public class ChainOfResponsability {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Manejador m1 = new ManejadorAprobado();
        Manejador m2 = new ManejadorDenegado();
        Manejador m3 = new ManejadorPendiente();
        m1.setSiguiente( m2 );
        m2.setSiguiente( m3 );
        
        //* estas son las llamadas 
        
        m1.comprobar("APROBADO");
        m1.comprobar("APROBADO");
        m1.comprobar("DENEGADO");
        m1.comprobar(null);
        m1.comprobar("DENEGADO");
    }
    
}
