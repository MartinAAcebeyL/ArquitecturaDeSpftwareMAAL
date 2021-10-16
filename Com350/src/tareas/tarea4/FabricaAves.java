package tareas.tarea4;

public class FabricaAves implements IFabricaAbstracta{

    @Override
    public IAves getIAve(String ave) {
          switch(ave){
            case "aguila":
                return new C_Aguila();
            case "loro":
                return new C_Loro();
            case "condor":
                return new C_Condor();
            default:
                return null;
        }
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
