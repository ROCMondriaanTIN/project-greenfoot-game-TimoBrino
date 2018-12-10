
import greenfoot.Actor;
import greenfoot.Greenfoot;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gebruiker
 */
public class HurtObject extends Actor {
    
    
    public HurtObject(int player) {
        setImage("p" + player + "_hurt.png");
        
    }
    @Override
     public void act() {
        // Add your action code here.
        if (getImage().toString().contains("hurt")) {
            if (Greenfoot.isKeyDown("space")) {
                Greenfoot.setWorld(new BeginScherm());
            }
        }
    }
}
     
   


     
