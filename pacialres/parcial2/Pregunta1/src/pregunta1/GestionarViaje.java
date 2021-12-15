package pregunta1;

import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author martin1
 */
public class GestionarViaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Viaje viaje = new Viaje("12-12-12","12:12","Peru");
        
        Alumno alumno = new Alumno("123456", "ale", Sexo.Femenino);
        
        IViaje viajeProxy = new viajeProxy(new Viaje1());
        
        viajeProxy.addPasajero(viaje, alumno);
        
        viajeProxy.listarPasajero(viaje);
        
        viajeProxy.addPasajero(viaje, alumno);*/
        
        Fachada fa = new Fachada();
        
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int op;
        
        do{
            System.out.println("elija una Opcion entre 1 y 5");
            System.out.println("1: Añadir Pasajero");
            System.out.println("2: Eliminar Pasajero");
            System.out.println("3: Mostrar Pasajeros");
            System.out.println("4: Mostar lista de acciones realizadas");
            System.out.println("% : Salir");
            op = sn.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Inserte Nombre:");
                    String nombre = sn.next();
                    System.out.println("Inserte CI:");
                    String ci = sn.next();
                    System.out.println("Inserte Sexo [F/M]:");
                    String sexo = sn.next();
                    fa.agregar(nombre, ci, sexo);
                    
                    break;
                case 2:
                    System.out.println("CI del Pasajero:");
                    String cie = sn.next();
                    fa.eliminar(cie);
                    break;
                case 3:
                    fa.listar();
                    break;
                case 4:
                    fa.mostrarHistorial();
                    break;
                case 5:
                    salir = true;
                    break;
                 default:
                     salir=true;
            }
        }while (!salir);
        System.out.println("gracias");
        
    }
    
}
