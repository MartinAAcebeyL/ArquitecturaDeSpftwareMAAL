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
public class ManejadorDenegado extends Manejador
{
    public ManejadorDenegado() {
    }
    // --------------------------------------------------
    @Override
     public void comprobar(String estado)
    {
       if( (estado != null) && (estado.equalsIgnoreCase("DENEGADO") == true) )
       {
           System.out.println("Solicitud denegada");
       }
       else
       {
             if( this.getSiguiente() != null )
            {
                // Llamamos al método en el siguiente objeto
                 this.getSiguiente().comprobar( estado );
            }
       }
    }
}
