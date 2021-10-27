/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareas.tarea5;

import java.util.Scanner;

/**
 *
 * @author martin1
 */
public class app {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pila pila = new Pila();
        IPila pilaProxy = new PilaProxy(new PilaA());
        
        while (true) {            
            System.out.println("1) insertar");
            System.out.println("2) eliminar");
            System.out.println("3) mostrar");
            System.out.println("0) salir");
            int op=sc.nextInt();
            switch(op){
                case 1:
                    System.out.println("Que # entrara?");
                    int num = sc.nextInt();
                    pilaProxy.insertar(pila, num);
                    break;
                case 2:
                    pilaProxy.eliminar(pila);
                    break;
                case 3:
                    pilaProxy.mostrar(pila);
                    break;
                case 0:
                    break;
            }
        }
        
    }
}
