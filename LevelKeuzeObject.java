
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

    @Override
    public void act() {
        if (speelbaar) {
            if (Greenfoot.mouseClicked(this)) {
                BeginScherm.worldRegistry.setLevel(level, BeginScherm.worldRegistry.getLevel(level).reset());
                BeginScherm.worldRegistry.getLevel(level).player = speler;
                BeginScherm.worldRegistry.getLevel(level).load();
            }
        }
    }
}
