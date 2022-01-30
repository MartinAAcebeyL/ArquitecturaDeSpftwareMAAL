/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author Carlos
 */
public class Observer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           SubjectCasa subject = new SubjectCasa();

        new BolivianosObservador(subject);
        new PesoARGObservador(subject);
        new PesoMXObservador(subject);

        System.out.println("Si desea cambiar 10 dólares obtendrá : ");
        subject.setMonto(10);
        System.out.println("Si desea cambiar 100 dólares obtendrá : ");
        subject.setMonto(100);
        System.out.println("Si desea cambiar 256 dólares obtendrá : ");
        subject.setMonto(256);

    }
    
}
