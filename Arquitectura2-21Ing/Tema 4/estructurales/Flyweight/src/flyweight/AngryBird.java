/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight;

/**
 *
 * @author Carlos
 */
class AngryBird implements IBird {
    private String color;
 
 
       public AngryBird(String color){
          this.color = color;       
       }
 
       @Override
       public void draw() {
          System.out.println("Angry Bird: Draw() [Color : " + color);
       }
    
}
