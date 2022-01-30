/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

import java.util.Vector;

/**
 *
 * @author Carlos
 */
class AgregadoConcreto implements Agregado {
     protected Vector aDatos = new Vector();
    // -------------------------
    public AgregadoConcreto() {
        this.llenar();
    }
    // -------------------------
    @Override
     public Iterador getIterador()
    {
        return new IteradorConcreto( this );
    }
    // -------------------------
    public void llenar()
    {
        this.aDatos.add( new String("JOSE") );
        this.aDatos.add( new String("MARTA") );
        this.aDatos.add( new String("ANTONIO") );
        this.aDatos.add( new String("ROMINA") );
    }

}
