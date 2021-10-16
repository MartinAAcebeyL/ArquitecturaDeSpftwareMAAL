package tareas.tarea4;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Zoologico zoo = Zoologico.getZoologico();
        Scanner sc = new Scanner(System.in);
        ArrayList<IMamiferos> lista_animales;
        
        while(true){
            System.out.println("Menu");
            System.out.println("1.- Añadir mamifero");
            System.out.println("2.- Añadir ave");
            System.out.println("3.- Añadir pez");
            System.out.println("4.- Ver mamifero");
            System.out.println("5.- Ver ave");
            System.out.println("6.- Ver ave");
            System.out.println("7.- Ver Zoologico");
            System.out.println("0.- Salir");
            System.out.println("******************");
            
            int op = sc.nextInt();
            if(op == 0)
                break;
            IFabricaAbstracta fabricador;
            Animal animal = null;
            
            int select;
            switch (op) {
                case 1:
                    fabricador = Fabricador.getFactory("mamifero");
                    System.out.println("1.- Leon");
                    System.out.println("2.- Oso");
                    System.out.println("3.- Mono");
                    select = sc.nextInt();
                    switch(select){
                        case 1:
                            animal = fabricador.getMamifero("leon");
                            break;
                        case 2:
                            animal = fabricador.getMamifero("oso");
                            break;
                        case 3:
                            animal = fabricador.getMamifero("mono");
                            break;
                    }
                    
                    zoo.pushMamifero(animal);
                    break;
                case 2:
                    fabricador = Fabricador.getFactory("ave");
                    System.out.println("1.- loro");
                    System.out.println("2.- aguila");
                    System.out.println("3.- condor");
                    select = sc.nextInt();
                    switch(select){
                        case 1:
                            animal = (Animal) fabricador.getIAve("loro");
                            break;
                        case 2:
                            animal = (Animal) fabricador.getIAve("aguila");
                            break;
                        case 3:
                            animal = (Animal) fabricador.getIAve("condor");
                            break;
                    }
                   
                    zoo.pushAve(animal);
                    break;
                case 3:
                    fabricador = Fabricador.getFactory("pez");
                    System.out.println("1.- pacu");
                    System.out.println("2.- sabalo");
                    select = sc.nextInt();
                    switch(select){
                        case 1:
                            animal = (Animal) fabricador.getIPez("pacu");
                            break;
                        case 2:
                            animal = (Animal) fabricador.getIPez("sabalo");
                            break;
                    }
                    
                    zoo.pushPez(animal);
                    break;
                case 4:
                    fabricador = Fabricador.getFactory("mamifero");
                    System.out.println("1.- Leon");
                    System.out.println("2.- Oso");
                    System.out.println("3.- Mono");
                    select = sc.nextInt();
                    switch(select){
                        case 1:
                            zoo.seeMamifero(fabricador.getMamifero("leon"));
                            break;
                        case 2:
                            zoo.seeMamifero(fabricador.getMamifero("oso"));
                            break;
                        case 3:
                            zoo.seeMamifero(fabricador.getMamifero("mono"));
                            break;
                    }
                    break;
                case 5:
                    fabricador = Fabricador.getFactory("ave");
                    System.out.println("1.- Loro");
                    System.out.println("2.- Aguila");
                    System.out.println("3.- Condor");
                    select = sc.nextInt();
                    switch(select){
                        case 1:
                            zoo.seeMamifero(fabricador.getMamifero("loro") );
                            break;
                        case 2:
                            zoo.seeMamifero(fabricador.getMamifero("aguila"));
                            break;
                        case 3:
                            zoo.seeMamifero(fabricador.getMamifero("condor"));
                            break;
                    }
                    break;
                case 6:
                    fabricador = Fabricador.getFactory("pez");
                    System.out.println("1.- pacu");
                    System.out.println("2.- sabalo");
                    select = sc.nextInt();
                    switch(select){
                        case 1:
                            zoo.seeMamifero(fabricador.getMamifero("pacu"));
                            break;
                        case 2:
                            zoo.seeMamifero(fabricador.getMamifero("sabalo"));
                            break;
                    }
                    break;
                case 7:
                    zoo.toString();
                    break;
                default:
                    break;
            }
        }
        System.out.println("gracias");
    }
}