
import greenfoot.World;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gebruiker
 */
public class InfoBalkje extends World{
    
    public InfoBalkje() {
        super(1000, 800, 1);
        this.setBackground("bg.png");
        addObject(new InfoCreate(), 500, 400);
    }
    
}
