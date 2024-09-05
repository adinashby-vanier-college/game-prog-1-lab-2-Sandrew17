// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Lobster extends Actor
{

    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("w")) {
            move(5);
        }
        if (Greenfoot.isKeyDown("a")) {
            turn(-7);
            move(-1);
        }
        if (Greenfoot.isKeyDown("d")) {
            turn(7);
            move(1);
        }
    }
}
