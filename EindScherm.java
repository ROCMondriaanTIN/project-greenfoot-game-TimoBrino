
import greenfoot.Greenfoot;
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
public class EindScherm extends World {
    
    int maxdiamonds = 8;
    
    
    
    public EindScherm(int diamonds) {
        super(1000, 800, 1);
        this.setBackground("bg_castle.png");
        
        if (diamonds == 0){
            setBackground("eindscherm1.png");
        }else if (diamonds < maxdiamonds / 2) {
           setBackground("eindscherm2.png");
        }else if (diamonds  < maxdiamonds){
            setBackground("eindscherm3.png");
        }else if (diamonds >= maxdiamonds){
            setBackground("eindscherm4.png");
        } 
    }
}
