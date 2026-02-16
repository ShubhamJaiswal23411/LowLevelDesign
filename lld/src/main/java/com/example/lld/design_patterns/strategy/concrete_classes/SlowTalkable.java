package com.example.lld.design_patterns.strategy.concrete_classes;

import com.example.lld.design_patterns.strategy.interfaces.Tallkable;

public class SlowTalkable implements Tallkable{

    @Override
    public String talk() {
        return "i talk slowly";
    }
    
}
