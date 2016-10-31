import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Move here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Move extends Actor
{
    private static final double WALKING_SPEED = 5.0;
    /**
     * Act - do whatever the Move wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void turn() 
    {
        turn(90);
    }    
     public void turn(int angle)
    {
        setRotation(getRotation() + angle);
    }
    public void move()
    {
        move(WALKING_SPEED);
    }
    public void move(double distance)
    {
        double angle = Math.toRadians( getRotation() );
        int x = (int) Math.round(getX() + Math.cos(angle) * distance);
        int y = (int) Math.round(getY() + Math.sin(angle) * distance);
        setLocation(x, y);
    }
    public boolean atWorldEdge()
    {
        if(getX() < 120 || getX() > getWorld().getWidth() - 120)
            return true;
        if(getY() < 120 || getY() > getWorld().getHeight() - 120)
            return true;
        else
            return false;
    }
}
