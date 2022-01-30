/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
class Mediador implements IMediador 
{
 private ArrayList<Colega> colegas;
    // -------------------------------
    public Mediador()
    {
        this.colegas = new ArrayList<Colega>();
    }
    // -------------------------------
     public void agregarColega(Colega colega)
    {
        this.colegas.add( colega );
    }
    // ------------------------------
    @Override
     public void enviar(String mensaje, Colega originator)
    {
        for( Colega colega : colegas )
        {
            if( colega != originator )
            {
                colega.recibir( mensaje );
            }
        }
    }   
}
