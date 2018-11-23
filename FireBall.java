/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Timo van Zuijlen
 */
public class FireBall extends Mover {
     public FireBall() {
        super();
        setImage("fireball.png");
     }
     
     
     @Override
    public void act() 
    {
        velocityX = 0;
        velocityY = 0;
        applyVelocity();
        turn(17);
    }    
}
