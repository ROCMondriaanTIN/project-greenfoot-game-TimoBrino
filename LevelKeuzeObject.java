
import greenfoot.Actor;
import greenfoot.Greenfoot;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Timo van Zuijlen
 */
public class LevelKeuzeObject extends Actor {
    
    private int level;
    private boolean speelbaar;
    private int speler;

    public LevelKeuzeObject(int level, boolean speelbaar, int speler) {

        if (speelbaar) {
            setImage("Level/level" + level + ".png");
        } else {
            setImage("Level/level" + level + "_false.png");
        }
        this.level = level;
        this.speelbaar = speelbaar;
        this.speler = speler;
    }

    /**
     * Act - do whatever the LevelKeuzeObject wants to do. This method is called
     * whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    @Override
    public void act() {
        if (speelbaar) {
            if (Greenfoot.mouseClicked(this)) {
                Start.worldRegistry.getLevel(level).player = speler;
                Start.worldRegistry.setLevel(level, Start.worldRegistry.getLevel(level).reset());
                Start.worldRegistry.getLevel(level).load();
                

            }
        }
    }
}
