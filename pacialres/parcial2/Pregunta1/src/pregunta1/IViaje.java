package pregunta1;

/**
 *
 * @author martin1
 */
public interface IViaje {
    Viaje addPasajero(Viaje viaje, Alumno alumno);
    Viaje removePasajero(Viaje viaje, String ci);
    void listarPasajero(Viaje viaje);
}
