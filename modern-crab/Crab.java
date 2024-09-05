// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * 
 */
public class Crab extends Actor
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * 
     */
    public void act()
    {
        checkCollision();
        checkKeys();
    }

    /**
     * Act - do whatever the Crab wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void checkKeys()
    {
        if (Greenfoot.isKeyDown("left")) {
            move(-8);
        }
        if (Greenfoot.isKeyDown("right")) {
            move(8);
        }
        if (Greenfoot.isKeyDown("up")) {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("down")) {
            turn(3);
        }
    }

    /**
     * 
     */
    private void checkCollision()
    {
        Lobster a = (Lobster)getOneIntersectingObject(Lobster.class);
        if (a != null) {
            getWorld().removeObject(this);
        }
    }
}
