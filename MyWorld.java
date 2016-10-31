import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(900, 600, 1); 
        setPaintOrder(Bild.class, 무당벌레.class);
        setPaintOrder(Bild.class, 파리.class);
        addObject(new 장애물(),450, 300);
        foundation();
    }
    public void foundation()
    {
        addObject(new 무당벌레(), Greenfoot.getRandomNumber(870), Greenfoot.getRandomNumber(570));
        addObject(new 파리(), Greenfoot.getRandomNumber(870), Greenfoot.getRandomNumber(570));
    }
}
