

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
public class LevelKeuze extends World {

    int levelMax = 4;
    int level = 2;
    LevelKeuzeObject[] levelTrue = new LevelKeuzeObject[levelMax];
    LevelKeuzeObject[] levelfalse = new LevelKeuzeObject[levelMax];
    int y = 400;
    int x = 200;

    public LevelKeuze(int level, int player, boolean first) {
        super(1000, 800, 1);
        this.setBackground("bg2.png");
        if (this.level < level) {
            this.level = level;
        }
        for (int i = 0; i < this.level; i++) {
            addObject(new LevelKeuzeObject(i + 1, true, player), x, y);
            x = x + 150;
        }
        for (int i = this.level; i < levelMax; i++) {
            addObject(new LevelKeuzeObject(i + 1, false, player), x, y);
            x = x + 150;
        }

    }

    @Override
    public void act() {
        
        }

    }


