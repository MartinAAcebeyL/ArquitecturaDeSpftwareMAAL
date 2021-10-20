
package parciales.parcial1.pregunta2;

public class FactoryPublicaciones implements IPublicaciones{

    @Override
    public Publicaciones crear(String tipo,String titulo) {
        if (tipo.equals("libro")) {
            return new Libro(titulo);
        }

        if (tipo.equals("periodico")) {
                return new Periodico(titulo);
        }

        if (tipo.equals("revista")) {
                return new Revista(titulo); //
        }
        return null;
    }
    
}
