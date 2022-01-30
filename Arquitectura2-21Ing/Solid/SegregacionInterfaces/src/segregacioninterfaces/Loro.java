/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segregacioninterfaces;

import segregacioninterfaces.nocumple.*;

/**
 *
 * @author Carlos
 */
public class Loro implements IAve, IAveVoladora {

    @Override
    public void comer() {
        System.out.println("Esta comiendo");
    }

    @Override
    public void volar() {
        System.out.println("Esta volando");
    }

}
