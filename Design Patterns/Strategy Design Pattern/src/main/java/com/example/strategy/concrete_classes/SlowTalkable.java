package com.example.strategy.concrete_classes;

import com.example.strategy.interfaces.Tallkable;

public class SlowTalkable implements Tallkable{

    @Override
    public String talk() {
        return "i talk slowly";
    }
    
}
