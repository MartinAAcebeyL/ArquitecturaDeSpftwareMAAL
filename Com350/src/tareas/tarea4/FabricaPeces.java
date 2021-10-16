package tareas.tarea4;

public class FabricaPeces implements IFabricaAbstracta{

    @Override
    public IAves getIAve(String ave) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IMamiferos getIMamifero(String mamifero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Mamiferos getMamifero(String mamifero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IPeces getIPez(String pez) {
          switch(pez){
            case "sabalo":
                return new C_Sabalo();
            case "pacu":
                return new C_Pacu();
            default:
                return null;
        }
    }   
}