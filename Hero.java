
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private final double acc;
    private final double drag;
    private int width;
    private boolean isOnGround;
    private int walkStatus;
    int status = 0;
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
    private GreenfootImage jump1;

    public Hero() {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        setImage("p1.png");
        //getImage().mirrorHorizontally();
        walkIm1 = new GreenfootImage("p1_walk1.png");
        walkIm2 = new GreenfootImage("p1_walk2.png");
        walkIm3 = new GreenfootImage("p1_walk3.png");
        walkIm4 = new GreenfootImage("p1_walk4.png");
        walkIm5 = new GreenfootImage("p1_walk5.png");
        walkIm6 = new GreenfootImage("p1_walk6.png");
        walkIm7 = new GreenfootImage("p1_walk7.png");
        walkIm8 = new GreenfootImage("p1_walk8.png");
        walkIm9 = new GreenfootImage("p1_walk9.png");
        walkIm10 = new GreenfootImage("p1_walk10.png");
        walkIm11 = new GreenfootImage("p1_walk11.png");
        jump1 = new GreenfootImage("p1_jump.png");
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
     private double posToNeg(double x) {
        return (x - (x * 2));
    }

    public void handleInput() {
   
        //on ground check and handling

        width = getImage().getWidth() / 2;

        Tile tile = (Tile) getOneObjectAtOffset(0, getImage().getHeight() / 2 + 1, Tile.class);
        if (tile == null) {
            tile = (Tile) getOneObjectAtOffset(this.width - 3, getImage().getHeight() / 2 + 1, Tile.class);
        }
        if (tile == null) {
            tile = (Tile) getOneObjectAtOffset((int) posToNeg(this.width) + 3, getImage().getHeight() / 2 + 1, Tile.class);
        }

        if (tile != null && tile.isSolid) {
            isOnGround = true;
        } else {
            isOnGround = false;
        }
        if (Greenfoot.isKeyDown("space")) {

            if (isOnGround) {
                velocityY = -15;
                animationJump(getWidth(), getHeight(), 1);
            }

        }

        if (Greenfoot.isKeyDown("left")) {
            velocityX = -10;
            animationWalk(getWidth(), getHeight(), 1, false);
        } else if (Greenfoot.isKeyDown("right")) {
            velocityX = 10;
            animationWalk(getWidth(), getHeight(), 1, true);
        } else {
            animationStand(getWidth(), getHeight(), 1);
        }
    }
     public void animationWalk(int width, int heigth, int player, boolean right) {
        
        if (status == 3) {
            if (walkStatus >= 11) {
                walkStatus = 1;
            }
            
            if (isOnGround) {
                setImage("p" + player + "_walk"
                        + walkStatus + ".png");
            }else{
                setImage("p" + player + "_jump.png");
            }
            if (right){
                right = false;
                
            }else if (!right){
                right = true;
                getImage().mirrorHorizontally();
            }
            walkStatus++;
            status = 0;
        } else {
            
            status++;
        }
        
        getImage().scale(width, heigth);
    }
      public void animationJump(int width, int heigth, int player) {
        setImage("p" + player + "_jump.png");
        getImage().scale(width, heigth);
    }

    public void animationStand(int width, int heigth, int player) {
        if (isOnGround) {
            setImage("p" + player + "_walk1.png");
            getImage().scale(width, heigth);
            walkStatus = 1;
        }else{
            setImage("p" + player + "_jump.png");
        }
        getImage().scale(width, heigth);
    }
    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }
  }
 

