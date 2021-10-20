/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parciales.parcial1.pregunta2;

import java.util.Scanner;

/**
 *
 * @author martin1
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Biblioteca biblioteca=Biblioteca.getInstance();
        FactoryPublicaciones fabrica = new FactoryPublicaciones();

        while(true) {
            System.out.println("1) insertar publicacion");
            System.out.println("2) mostrar publicaciones");
            System.out.println("3) mostrar biblioteca");
            System.out.println("0) salir");
            int opcion = sc.nextInt();
            if(opcion == 0)
                break;
            Publicaciones publicacion;
            switch(opcion){
                case 1:
                    System.out.println("\nQuiere insertar un:");
                    System.out.println("1) Libro");
                    System.out.println("2) Periodico");
                    System.out.println("3) revista");
                    int p = sc.nextInt();
                    System.out.println("Inserte el titulo");
                    String titulo=sc.next();
                    System.out.println("*********");
                    switch(p){
                        case 1:
                            publicacion=new Libro(titulo);
                            biblioteca.agregar_publicacion(publicacion);
                            break;
                        case 2:
                            publicacion=new Periodico(titulo);
                            biblioteca.agregar_publicacion(publicacion);
                            break;
                        case 3:
                            publicacion=new Revista(titulo);
                            biblioteca.agregar_publicacion(publicacion);
                            break;
                    }
                    
                    break;
                case 2:
                    for(int i=0;i<biblioteca.getLista_publicaciones().size();i++){
                        System.out.println((i+1)+" "+biblioteca.getLista_publicaciones().get(i));
                    }
                    break;
                case 3:
                    System.out.println(biblioteca);
                    break;
            }
        }
    }
}
