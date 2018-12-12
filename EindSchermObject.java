
import greenfoot.Actor;
import greenfoot.Greenfoot;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gebruiker
 */
public class EindSchermObject extends Actor {
    
    
    private int scherm;
    
    public EindSchermObject(int scherm){
        
        setImage("eindscherm" + scherm +".png");
        this.scherm = scherm;

    }
    @Override
    public void act(){
        
    }
    
}
