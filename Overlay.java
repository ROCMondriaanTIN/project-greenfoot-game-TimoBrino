
import greenfoot.Actor;
import greenfoot.GreenfootImage;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gebruiker
 */
public class Overlay extends Actor {
    private ArrayList<HUDImage> lives = new ArrayList<>();
    private ArrayList<HUDImage> diamant = new ArrayList<>();
    private final GreenfootImage coinSilver = new GreenfootImage("coinSilver.png");
    private final GreenfootImage coinGold = new GreenfootImage("coinGold.png");
    private int coinID = 0;
    private int player;
    private boolean gotKey = false;
    HUDImage key = new HUDImage(40, 40);

    public Overlay(int player) {
        
        this.player = player;

        coinSilver.scale(40, 40);
        coinGold.scale(40, 40);
        this.setImage(new GreenfootImage(1000, 800));
        this.getImage().clear();
        coinID = 0;
    }
     
    
     @Override
    public void act() {
        update();
    }

    public void addCoin(String color) {
        if (color.equals("Gold")) {  
            getImage().drawImage(coinGold, 950 - 10 * coinID, 30);
        } else {
            getImage().drawImage(coinSilver, 950 - 10 * coinID, 30);
        }
        coinID++;
    }

    public void update() {

        for (int i = 0; i < lives.size(); i++) {
            getWorld().addObject(lives.get(i), 50 + 50 * i, 50);
        }

        if (diamant.size() > 0) {
            for (int i = 0; i < diamant.size(); i++) {
                getWorld().addObject(diamant.get(i), 50 + 30 * i, 100);

            }
        }

        if (gotKey) {

            getWorld().addObject(key, 950, 100);
        }
    }

    public void extraLeven() {
        this.getImage().clear();
        coinID = 0;
        lives.add(new HUDImage(player, 40, 40));
    }

    public void removeLive() {

        getWorld().removeObject(lives.get(lives.size() - 1));
        lives.remove(lives.size() - 1);

    }

    public void gotKey(String color) {
        gotKey = true;
        key.setKeyColor(color);
    }

    public void openedDoor() {
        gotKey = false;
        getWorld().removeObject(key);
    }

    public void addDiamant(String color) {
        diamant.add(new HUDImage(color, 50, 50));
    }

    public void setPlayer(int player, int lives) {
        for (int i = 0; i < this.lives.size(); i++) {
            getWorld().removeObject(this.lives.get(i));
        }
        this.lives.clear();
        this.player = player;
        for (int i = 0; i < lives; i++) {
            this.lives.add(new HUDImage(player, 40, 40));
        }
    }
}
