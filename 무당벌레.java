import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class 무당벌레 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class 무당벌레 extends Move
{
    public int v = 6;    // die Geschwindigkeit der Fliege
    public double r =0;  // die Richtung in die die Fliege guckt
    public int a = 200;  // der Abstand zur Maus, ab dem die Fliege reagiert
    public boolean dead = false;  //  selbsterklaerend()
    public GreenfootSound music = new GreenfootSound("Dessert.mp3");
    /**
     * Act - do whatever the 무당벌레 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       music.playLoop();
        if(!dead)
        {
            if(mausInadjoin()){
                flee();
            }
            if(!mausInadjoin())
                inDieCenter();
        }
        die();
    }
    public void flee()
    {
        MouseInfo m = Greenfoot.getMouseInfo();  
        if(m != null) 
        {  
             int x = m.getX() - getX();  
             int y = m.getY() - getY();  
             r = Math.toDegrees(Math.atan2(x, y)) - 270;  
             setRotation(-(int) r);  
        }  
        move(v);
    }
    public void inDieCenter()
    {
        if(atWorldEdge())
        {
             int x = getWorld().getWidth()/2 - getX();  
             int y = getWorld().getHeight()/2 - getY();
             r = Math.toDegrees(Math.atan2(x, y)) -90;  
             setRotation(-(int) r);  
            move(v);
        }
    }
    public void die()
    {
        if(Greenfoot.mouseClicked(this))
        {
            dead = true;
            setImage("Fleck.png");
            getWorld().addObject(new Bild(), getWorld().getWidth()/2, getWorld().getHeight()/2);
        }
    }
     public boolean mausInadjoin()
    {
        MouseInfo m = Greenfoot.getMouseInfo();
        if(m != null) 
        { 
            if(m.getX() > getX())
            {
                if((m.getX()- getX()) < a)
                {
                    if(m.getY() > getY()) 
                    {
                        if((m.getY()- getY()) < a) 
                            return true;
                    }
                    if(m.getY() < getY())
                    {
                        if((getY()- m.getY()) < a) 
                            return true;
                    }  
                }
            }
            if(m.getX() < getX())
            {
                if((getX()- m.getX()) < a)
                {
                    if(m.getY() > getY()) 
                    {
                        if((m.getY()- getY()) < a) 
                            return true;
                    }
                    if(m.getY() < getY())
                    {
                        if((getY()- m.getY()) < a) 
                            return true;
                    }   
                }
            }
        }
        return false;
    }
}
