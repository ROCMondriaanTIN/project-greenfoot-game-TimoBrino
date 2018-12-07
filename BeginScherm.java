
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
        
    public static final WorldRegistry worldRegistry = new WorldRegistry();

    
    public BeginScherm() {
        super(1000, 800, 1);
        Greenfoot.start();
        this.setBackground("bg2.png");
        createObject();
        setLevels();
    }
     public void createObject() {
        addObject(new Titel(), 475, 200);

        addObject(new PlayerSelect(1), 150, 500);
        addObject(new PlayerSelect(2), 500, 500);
        addObject(new PlayerSelect(3), 850, 500);
    }
    
    public void setLevels(){
        MyWorld.firstTime = true;
        worldRegistry.registerLevel(1, new Level1());
        worldRegistry.registerLevel(2, new Level1());
       
        
    }
    
     
}
