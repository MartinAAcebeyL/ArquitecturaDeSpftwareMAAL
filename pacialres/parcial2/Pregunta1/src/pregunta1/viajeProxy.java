package pregunta1;

import java.sql.*;

/**
 *
 * @author martin1
 */
public class viajeProxy implements IViaje {

    private Conectar conectar = new Conectar();
    private Connection con = null;
    
    private IViaje viaje;

    public viajeProxy(IViaje viaje) {
        this.viaje = viaje;
    }

    @Override
    public Viaje addPasajero(Viaje _viaje, Alumno alumno) {
        try {
            con = conectar.getConexion();
            PreparedStatement ps = con.prepareStatement("INSERT INTO viajes(accion,fecha,hora,destino) value('Añadir','"+_viaje.getFecha()+"','"+_viaje.getHora()+"','"+_viaje.getDestino()+"' )");
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        if (viaje == null) {
            viaje = new Viaje1();
            return viaje.addPasajero(_viaje, alumno);
        } else {
            return viaje.addPasajero(_viaje, alumno);
        }
    }

    @Override
    public Viaje removePasajero(Viaje _viaje, String ci) {
        try {
            con = conectar.getConexion();
            PreparedStatement ps = con.prepareStatement("INSERT INTO viajes(accion) value('Remover')");
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        if (viaje == null) {
            viaje = new Viaje1();
            return viaje.removePasajero(_viaje, ci);
        } else {
            return viaje.removePasajero(_viaje, ci);
        }
    }

    @Override
    public void listarPasajero(Viaje _viaje) {
        try {
           con = conectar.getConexion();
            PreparedStatement ps = con.prepareStatement("INSERT INTO viajes(accion) value('Listar')");
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        if (viaje == null) {
            viaje = new Viaje1();
            viaje.listarPasajero(_viaje);
        } else {
            viaje.listarPasajero(_viaje);
        }
    }

}
