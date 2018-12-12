
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
public class InfoCreate extends Actor {

    public InfoCreate() {
        setImage("infoObject.png");
    }

    @Override
    public void act() {
        if (Greenfoot.isKeyDown("enter")) {
            Greenfoot.setWorld(new BeginScherm());
        }
    }
}
