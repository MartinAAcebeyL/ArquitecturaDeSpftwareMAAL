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
public class Liskov {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Vehiculo vehiculo1 =new Vehiculo(Color.Rojo, "tip-1625", TipoVehiculo.Auto);
        System.out.println(vehiculo1.precioimportacion());

        Toyota  vehiculo2 =new Toyota(Color.Azul, "CAR-2255", TipoVehiculo.Camion);
        System.out.println(vehiculo2.precioimportacion());
    }
    
}
