
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Enemy extends Mover {

    private int walkRange;
    private int xMin;
    private int xMax;
    private boolean firstAct;
    private int speed;
    private int status;
    private int walkStatus = 1;
    private String direction = "left";
    private GreenfootImage walkSnail1 = new GreenfootImage("snailWalk1.png");
    private GreenfootImage walkSnail2 = new GreenfootImage("snailWalk2.png");
    private GreenfootImage snailShell = new GreenfootImage("snailShell.png");
    private GreenfootImage snailShell_upsidedown = new GreenfootImage("snailShell_upsidedown.png");

    public Enemy() {
        super();
        setImage(walkSnail1);
        getImage().mirrorHorizontally();
        walkRange = 140;
        firstAct = true;
        speed = 1;
        
        
        
    }

    @Override
    public void act() {
        int x = getX();
        int y = getY();

        if (firstAct) {
            firstAct = false;
            xMin = x - walkRange / 2;
            xMax = x + walkRange / 2;
        }

         if (!getImage().toString().contains("upside")) {
            velocityX = speed;
            applyVelocity();
            if (getX() >= xMax) {
                speed *= -1;
                x = xMax;
                direction = "left";
            } else if (getX() <= xMin) {
                speed *= -1;
                x = xMin;
                direction = "right";

            }
           Change();
        }else{
            speed = 0;
            velocityX = speed;
            applyVelocity();
        }
    }
    public void Change(){
        
        
        if (status == 2) {
            if (walkStatus > 2) {
                walkStatus = 1;
            }
            setImage("snailWalk" + walkStatus + ".png");
            walkStatus++;
            
        status = 0;
        if (direction.equals("right")){
            getImage().mirrorHorizontally();
        }
        }else{
            status ++;
        }
        
    } 
    public void dood() {

        setImage("snailShell_upsidedown.png");
    }
}
