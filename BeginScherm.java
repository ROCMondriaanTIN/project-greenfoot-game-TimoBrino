
import greenfoot.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Timo van Zuijlen
 */


public class BeginScherm extends World{
    
    public BeginScherm() {
        super(1000, 800, 1);
        Greenfoot.start();
        this.setBackground("bg2.png");
        addObject(new Titel(), 475, 200);
    }
    
    public void act(){
        if (Greenfoot.isKeyDown("enter")) Greenfoot.setWorld(new MyWorld());
       
        
    }
    
     
}
