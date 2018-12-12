
import greenfoot.*;
import java.util.List;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private final double acc;
    private final double drag;
    private int width;
    boolean gotSilver;
    private int lives = 2;
    private boolean isOnGround;
    private int walkStatus;
    int status = 0;
    private String direction = "right";
    private int spawnX;
    private int spawnY;
    private int player;
    private int coin = 0;
    private boolean gotkey;
    private int level;
    private int diamonds;
    private Overlay overlay;
    private CollisionEngine collisionEngine;
    private TileEngine tileEngine;


    public Hero(Overlay overlay) {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        this.overlay = overlay;
    }

    public void addTileEngine(CollisionEngine collisionEngine, TileEngine tileEngine) {
        this.collisionEngine = collisionEngine;
        this.tileEngine = tileEngine;
    }

    @Override
    public void act() {
        handleInput();
        atWorldEdge();
//        System.out.println(getX());
//        System.out.println(getY());
//        System.out.println("");
        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();
        checkForBlock();
        checkEnemy();
        checkFireBall();

    }

    public void checkEnemy() {
        for (Enemy enemy : getIntersectingObjects(Enemy.class)) {
            if (enemy != null) {
                if (!enemy.getImage().toString().contains("upside")) {
                    if (velocityY > 1) {
                        enemy.dood();
                    } else {
                        dood();
                    }
                    break;
                }
            }
        }
    }

    public void checkFireBall() {
        for (Actor fireball : getIntersectingObjects(FireBall.class)) {
            if (fireball != null) {
                dood();
                break;
            }
        }
    }

    public void checkForBlock() {
        for (Tile tile : getIntersectingObjects(Tile.class)) {
            
        
            if (tile != null) {
                if (tile.type == TileType.WATER) {
                    dood();
                    break;
                }
                if (tile.type == TileType.SILVERCOIN) {
                    getWorld().removeObject(tile);
                    coin++;
                    gotSilver = true;
                    getLives();
                    if (coin != 0) {
                        overlay.addCoin("Silver");
                    }
                    break;
                } else if (tile.type == TileType.GOLDCOIN) {
                    getWorld().removeObject(tile);
                    coin += 2;
                    getLives();
                    if (coin != 0) {
                        overlay.addCoin("Gold");
                    }
                    break;
                }
                else if (tile.type == TileType.GEM) {
                    getWorld().removeObject(tile);
                    diamonds ++;
                    overlay.addDiamant("Blue");
                    DiamantsGot.getInstance().gotDiamand(level, tile.getColom(), tile.getRow());
                    break;
                } 
                else if (tile.type == TileType.KEY) {
                    getWorld().removeObject(tile);
                    gotkey = true;
                    overlay.gotKey("Yellow");
                    break;
                }
                else if (tile.type == TileType.CLOSED && gotkey) {
                    tile.setImage("door_openMid.png");
                    tile.setType(TileType.OPEN);
                    overlay.openedDoor();
                    getOneObjectAtOffset(tile.getImage().getWidth()/2, tile.getImage().getHeight() / 2 - 70, Tile.class).setImage("door_openTop.png");
                    gotkey = false;
                    break;
                } 
                if (tile.type == TileType.OPEN){
                       if (level < 4) {
                        Greenfoot.setWorld(new LevelKeuze(level + 1, player, false));
                        
                    } else {
                        Greenfoot.setWorld(new EindScherm(diamonds));
                    }
                    
                }
            }
        }
    }

    private double posToNeg(double x) {
        return (x - (x * 2));
    }

    public void handleInput() {
        //gekregen van gijs de lange en zelf iets veranderd.
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
                velocityY = -17;
                animationJump(getWidth(), getHeight());
            }
        }
        if (Greenfoot.isKeyDown("left")) {
            velocityX = -10;
            direction = "left";
            animationWalk(getWidth(), getHeight());
        } else if (Greenfoot.isKeyDown("right")) {
            velocityX = 10;
            direction = "right";
            animationWalk(getWidth(), getHeight());
        } else {
            animationStand(getWidth(), getHeight());
        }
    }

    public void animationWalk(int width, int heigth) {
        if (status == 2) {
            if (walkStatus >= 11) {
                walkStatus = 1;
            }
            if (isOnGround) {
                setImage("p" + player + "_walk"
                        + walkStatus + ".png");
            } else {
                setImage("p" + player + "_jump.png");
            }
            mirror();
            walkStatus++;
            status = 0;
        } else {
            status++;
        }
        getImage().scale(width, heigth);
    }

    public void animationJump(int width, int heigth) {
        setImage("p" + player + "_jump.png");
        mirror();
        getImage().scale(width, heigth);
    }

    public void animationStand(int width, int heigth) {
        if (isOnGround) {
            setImage("p" + player + "_walk1.png");
            getImage().scale(width, heigth);
            walkStatus = 1;
        } else {
            setImage("p" + player + "_jump.png");
        }
        mirror();
        getImage().scale(width, heigth);
    }

    public void mirror() {
        if (direction.equals("left")) {
            getImage().mirrorHorizontally();
        }
    }

    public void dood() {
        lives--;
        if (lives > 0) {
            setLocation(spawnX, spawnY);
            overlay.removeLive();
        } else {
            Greenfoot.setWorld(new GameOver(player));
        }

    }

    public void getLives() {
        if (coin >= 40) {
            lives++;
            coin -= 40;
            overlay.extraLeven();
        }
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setPlayer(int player) {
        setImage("p1_stand.png");
        setImage("p2_stand.png");
        setImage("p3_stand.png");
        this.player = player;
        overlay.setPlayer(player, lives);
    }

    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }

    void setSpawn(int heroSpawnX, int heroSpawnY) {
        this.spawnX = heroSpawnX;
        this.spawnY = heroSpawnY;

    }

}
