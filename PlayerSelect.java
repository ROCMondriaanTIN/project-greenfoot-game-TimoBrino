
import greenfoot.Actor;
import greenfoot.Color;
import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;
import greenfoot.MouseInfo;
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

    public PlayerSelect(String text, int size) {
        setImage(new GreenfootImage(text, size, Color.YELLOW, new Color(0, 0, 0, 0), Color.RED));

    }

    /**
     * Act - do whatever the PlayerSelect wants to do. This method is called
     * whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    @Override
    public void act() {
        // Add your action code here.
        if (getImage().toString().contains("Player")) {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            if (mouse != null) {
                List objects = getWorld().getObjectsAt(mouse.getX(), mouse.getY(), PlayerSelect.class);
                for (Object object : objects) {
                    if (object == this) {
                        setImage("p" + player + "_front.png");

                    } else {
                        setImage("p" + player + "_stand.png");
                    }

                }
            }
            if (Greenfoot.mouseClicked(this)) {
                Greenfoot.setWorld(new LevelKeuze(1, player));
                
            }
        }
    }

        @Override
    public void setImage(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
