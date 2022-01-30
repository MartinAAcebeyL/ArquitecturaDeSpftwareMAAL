/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liskov;

/**
 *
 * @author Carlos
 */
public class Nisan extends Vehiculo {

    public Nisan(Color color, String placa, TipoVehiculo tipovehiculo) {
        super(color, placa, tipovehiculo);
    }

    public double precioMedio() {
        return 20201;
    }
    
}
