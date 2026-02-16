package com.example.strategy.abstract_classes;

import com.example.strategy.interfaces.Readable;
import com.example.strategy.interfaces.Tallkable;
import com.example.strategy.interfaces.Walkable;

public abstract class RobotTemplate {
    private Readable readable ;
    private Walkable walkable ;
    private Tallkable talkable ;

    public RobotTemplate(Readable readable, Tallkable talkable, Walkable walkable) {
        this.readable = readable;
        this.talkable = talkable;
        this.walkable = walkable;
    }

    public String walk(){
        return walkable.walk();
    }

    public String talk(){
        return talkable.talk();
    }
    
    public String read(){
        return readable.read();
    }
    
    public abstract void projection();
 
}
