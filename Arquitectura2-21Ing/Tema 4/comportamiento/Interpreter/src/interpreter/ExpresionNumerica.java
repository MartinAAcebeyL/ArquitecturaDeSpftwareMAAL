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
public class ExpresionNumerica implements IExpresion {
    private String valor;

    public ExpresionNumerica(String valor) {
        this.valor = valor;
    }


    @Override
    public void interprete(Contexto contexto) {
      contexto.setOperador(contexto.getInteger(valor));
      contexto.calcular();  
    }
    
}
