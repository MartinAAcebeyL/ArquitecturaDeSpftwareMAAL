/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada;

/**
 *
 * @author Carlos
 */
public class Fachada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ObtenerFacade cliente1 = new ObtenerFacade();
        cliente1.buscar("26/10/2021", "30/10/2021", "Sucre", "Santa Cruz");

        ObtenerFacade cliente2 = new ObtenerFacade();
        cliente2.buscar("02/11/2021", "08/1/2021", "Sucre", "La Paz");
    }
    
}
