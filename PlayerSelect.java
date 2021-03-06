
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
public class PlayerSelect extends Actor {
  

    private int player;

    public PlayerSelect(int player) {
        setImage("p" + player + "_stand.png");
        this.player = player;
    }
    
    @Override
    public void act() {
        // Add your action code here.
        if (getImage().toString().contains("P")) {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            if (mouse != null) {
                List objects = getWorld().getObjectsAt(mouse.getX(), mouse.getY(), PlayerSelect.class);
                for (Object object : objects) {
                    if (object == this) {
                        setImage("p" + player + "_jump.png");

                    } else {
                        setImage("p" + player + "_front.png");
                    }

                }
            }
            if (Greenfoot.mouseClicked(this)) {
                Greenfoot.setWorld(new LevelKeuze(1, player, true));
        }
    }
  }
}
