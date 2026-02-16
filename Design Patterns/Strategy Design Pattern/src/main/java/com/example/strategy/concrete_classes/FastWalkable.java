package com.example.strategy.concrete_classes;

import com.example.strategy.interfaces.Walkable;

public class FastWalkable implements Walkable{

    @Override
    public String walk() {
        return "i walk fast";
    }
    
}
