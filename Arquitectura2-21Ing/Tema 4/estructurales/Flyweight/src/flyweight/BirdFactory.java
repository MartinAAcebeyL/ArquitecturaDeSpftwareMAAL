/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight;

import java.util.HashMap;

/**
 *
 * @author Carlos
 */
public class BirdFactory {
 
       private static final HashMap angrybirdMap = new HashMap();
 
       public static IBird getAngryBird(String color) {
          AngryBird angrybird = (AngryBird)angrybirdMap.get(color);
 
          if(angrybird == null) {
              angrybird = new AngryBird(color);
              angrybirdMap.put(color, angrybird);
             System.out.println("Creating Angry Bird of color : " + color);
          }
          return angrybird;
       }
    }

