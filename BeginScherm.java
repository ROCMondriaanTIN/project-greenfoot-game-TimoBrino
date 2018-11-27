
import greenfoot.*;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Timo van Zuijlen
 */
public class BeginScherm extends Actor{
    
      private int player;

    public BeginScherm(int player) {
        setImage("p" + player + "_stand.png");
        this.player = player;
    }
    public BeginScherm(String text, int size) {
        setImage(new GreenfootImage(text, size, Color.YELLOW, new Color(0, 0, 0, 0), Color.RED));

    }
      @Override
    public void act() {
        // Add your action code here.
        if (getImage().toString().contains("Player")) {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            if (mouse != null) {
                List objects = getWorld().getObjectsAt(mouse.getX(), mouse.getY(), BeginScherm.class);
                for (Object object : objects) {
                    if (object == this) {
                        setImage("Player/p" + player + "_front.png");

                    } else {
                        setImage("Player/p" + player + "_stand.png");
                    }

                }
            }
        }
    }
}
