package com.example.design_patterns.strategy.abstract_classes;

import com.example.design_patterns.strategy.interfaces.Readable;
import com.example.design_patterns.strategy.interfaces.Tallkable;
import com.example.design_patterns.strategy.interfaces.Walkable;

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
