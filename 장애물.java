import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class 장애물 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class 장애물 extends Actor
{
    /**
     * Act - do whatever the 장애물 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(getOneObjectAtOffset(0,0, 무당벌레.class) != null){
            getWorld().removeObject(this);
            Greenfoot.stop();
    }
        if(getOneObjectAtOffset(0,0, 파리.class) != null){
            getWorld().removeObject(this);
            Greenfoot.stop();
    }
    }    
}
