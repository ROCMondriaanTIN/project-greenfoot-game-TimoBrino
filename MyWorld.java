
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *
 * @author R. Springer
 */
public abstract class MyWorld extends World {

    private CollisionEngine ce;
    int map[][];
    static protected Hero hero;
    int player = 1;
    public static boolean firstTime = true;

    /**
     * Constructor for objects of class MyWorld.
     *
     */
    public MyWorld() {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1, false);
        if (firstTime) {
            firstTime = false;
            hero = new Hero();
        }
        this.setBackground("bg2.png");
    }

    public abstract void load();

    public void create(int level, int heroSpawnX, int heroSpawnY) {
        TileEngine te = new TileEngine(this, 70, 70, this.map);
        Camera camera = new Camera(te);
        hero.setSpawn(heroSpawnX, heroSpawnY);
        hero.setLevel(level);

        camera.follow(hero);

        addObject(camera, 0, 0);
        addObject(hero, heroSpawnX, heroSpawnY);
//        addObject(overlay, 0, 0);
        camera.act();
        hero.act();

        ce = new CollisionEngine(te, camera);

        ce.addCollidingMover(hero);
    }

    @Override
    public void act() {
        ce.update();
    }
        public MyWorld reset() {
        return this;
    }
    
}
