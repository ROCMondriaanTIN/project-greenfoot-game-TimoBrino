
import greenfoot.World;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Timo van Zuijlen
 */
public class LevelKeuze extends World{
        int levelMax = 4;
    int level = 1;
    LevelKeuzeObject[] levelTrue = new LevelKeuzeObject[levelMax];
    LevelKeuzeObject[] levelfalse = new LevelKeuzeObject[levelMax];
    int y = 400;
    int x = 200;

    /**
     * Constructor for objects of class LevelKeuze.
     *
     */
    public LevelKeuze(int level, int speler) {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1, false);
        setBackground("bg.png");
        if (this.level < level) {
            this.level = level;
        }
        for (int i = 0; i < level; i++) {
            addObject(new LevelKeuzeObject(i + 1, true, speler), x, y);
            x= x + 100;
        }
        for (int i = level; i < levelMax; i++) {
            addObject(new LevelKeuzeObject(i+1, false, speler), x, y);
            x = x + 100;
        }
        
    }

    @Override
    public void act() {
        
    }
}
