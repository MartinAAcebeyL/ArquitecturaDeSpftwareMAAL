package tareas.tarea4;

public class Fabricador {
   public static IFabricaAbstracta getFactory(String tipoFabrica) {
       switch(tipoFabrica){
           case "mamifero":
               return new FabricaMamiferos();
           case "ave":
               return new FabricaAves();
           case "pez":
               return new FabricaPeces();
            default:
                return null;
       }
    }
}