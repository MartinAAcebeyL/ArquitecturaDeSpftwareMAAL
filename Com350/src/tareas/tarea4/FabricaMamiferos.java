package tareas.tarea4;

public class FabricaMamiferos implements IFabricaAbstracta{

    @Override
    public IAves getIAve(String ave) {
        return null;
    }

    @Override
    public IMamiferos getIMamifero(String mamifero) {
        switch(mamifero){
            case "leon":
                return new C_Leon();
            case "mono":
                return new C_Mono();
            case "oso":
                return new C_Oso();
            default:
                return null;
        }
    }
    
    @Override
    public Mamiferos getMamifero(String mamifero) {
        switch(mamifero){
            case "leon":
                return new C_Leon();
            case "mono":
                return new C_Mono();
            case "oso":
                return new C_Oso();
            default:
                return null;
        }
    }

    @Override
    public IPeces getIPez(String pez) {
        return null;
    }
    
}
