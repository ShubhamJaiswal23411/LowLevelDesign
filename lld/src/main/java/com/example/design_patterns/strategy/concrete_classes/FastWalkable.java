package com.example.design_patterns.strategy.concrete_classes;

import com.example.design_patterns.strategy.interfaces.Walkable;

public class FastWalkable implements Walkable{

    @Override
    public String walk() {
        return "i walk fast";
    }
    
}
