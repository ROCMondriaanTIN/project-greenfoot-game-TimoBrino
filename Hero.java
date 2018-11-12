
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private final double acc;
    private final double drag;
    private GreenfootImage walkIm1;
    private GreenfootImage walkIm2;
    private GreenfootImage walkIm3;
    private GreenfootImage walkIm4;
    private GreenfootImage walkIm5;
    private GreenfootImage walkIm6;
    private GreenfootImage walkIm7;
    private GreenfootImage walkIm8;
    private GreenfootImage walkIm9;
    private GreenfootImage walkIm10;
    private GreenfootImage walkIm11;

    public Hero() {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        setImage("p1.png");
        //getImage().mirrorHorizontally();
        walkIm1 = new GreenfootImage("p1_walk01.png");
        walkIm2 = new GreenfootImage("p1_walk02.png");
        walkIm3 = new GreenfootImage("p1_walk03.png");
        walkIm4 = new GreenfootImage("p1_walk04.png");
        walkIm5 = new GreenfootImage("p1_walk05.png");
        walkIm6 = new GreenfootImage("p1_walk06.png");
        walkIm7 = new GreenfootImage("p1_walk07.png");
        walkIm8 = new GreenfootImage("p1_walk08.png");
        walkIm9 = new GreenfootImage("p1_walk09.png");
        walkIm10 = new GreenfootImage("p1_walk10.png");
        walkIm11 = new GreenfootImage("p1_walk11.png");
    }

    @Override
    public void act() {
        handleInput();
        
        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();

        for (Actor enemy : getIntersectingObjects(Enemy.class)) {
            if (enemy != null) {
                getWorld().removeObject(this);
                break;
            }
        }
    }

    public void handleInput() {
        if (Greenfoot.isKeyDown("space")) {
            velocityY = -10;
            setImage("p1_jump.png");
        }

        if (Greenfoot.isKeyDown("left")) {
            velocityX = -10;
            //getImage().mirrorHorizontally();
            if( getImage() == walkIm1){
               setImage(walkIm2);
            }else if (getImage() == walkIm2){
               setImage(walkIm3);
            }else if (getImage() == walkIm3){
                setImage(walkIm4);
            }else if (getImage() == walkIm4){
                setImage(walkIm5);
            }else if (getImage() == walkIm5){
                setImage(walkIm6);
            }else if (getImage() == walkIm6){
                setImage(walkIm7);
            }else if (getImage() == walkIm7){
                setImage(walkIm8);
            }else if (getImage() == walkIm8){
                setImage(walkIm9);
            }else if (getImage() == walkIm9){
                setImage(walkIm10);
            }else if (getImage() == walkIm10){
                setImage(walkIm11);
            }else{
               setImage(walkIm1);
            }
            
        }
         if (Greenfoot.isKeyDown("right")) {
            velocityX = 10;
            //getImage().mirrorHorizontally();
            if( getImage() == walkIm1){
               setImage(walkIm2);
            }else if (getImage() == walkIm2){
               setImage(walkIm3);
            }else if (getImage() == walkIm3){
                setImage(walkIm4);
            }else if (getImage() == walkIm4){
                setImage(walkIm5);
            }else if (getImage() == walkIm5){
                setImage(walkIm6);
            }else if (getImage() == walkIm6){
                setImage(walkIm7);
            }else if (getImage() == walkIm7){
                setImage(walkIm8);
            }else if (getImage() == walkIm8){
                setImage(walkIm9);
            }else if (getImage() == walkIm9){
                setImage(walkIm10);
            }else if (getImage() == walkIm10){
                setImage(walkIm11);
            }else{
               setImage(walkIm1);
            }
            
        }
    }

    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }
  }

