
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
public class GameOver extends World{
    
    public GameOver(int player) {
        super(1000, 800, 1);
        this.setBackground("bg3.jpg");
        addObject(new HurtObject(player), 500, 500);
        addObject(new GameOverObject(), 500 , 200);
        addObject(new Opnieuw(), 500, 600);
    }
    
}
