package com.example.lld.design_patterns.strategy.concrete_classes;

import com.example.lld.design_patterns.strategy.interfaces.Walkable;

public class SlowWalkable implements Walkable{

    @Override
    public String walk() {
        return "i walk slowly";
    }
    
}
