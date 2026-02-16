package com.example.strategy.concrete_classes;

import com.example.strategy.interfaces.Walkable;

public class SlowWalkable implements Walkable{

    @Override
    public String walk() {
        return "i walk slowly";
    }
    
}
