/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;

import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public class Interpreter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String[] expresion = new String[3];
        expresion[0] = "mas";
        expresion[1] = "cuatro";
        expresion[2] = "ocho";

        ArrayList<IExpresion> arbol = new ArrayList<IExpresion>();
        Contexto contexto = new Contexto();
        for (String token : expresion) {

            if (contexto.getInteger(token) >= 0) {
                arbol.add(new ExpresionNumerica(token));
            } else {
                arbol.add(new ExpresionOperacion(token));
            }

        }

        for (IExpresion e : arbol) {
            e.interprete(contexto);
        }

        System.out.println("El resultado de la interpretación es " + contexto.getResultado());
    }
    
}
