/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;

/**
 *
 * @author Carlos
 */
public class ExpresionOperacion implements IExpresion {

    private String operacion;

    public ExpresionOperacion(String operacion) {

        this.operacion = operacion;

    }

    @Override
    public void interprete(Contexto contexto) {
        contexto.setOperacion(this.operacion);
        contexto.calcular();
    }

}
