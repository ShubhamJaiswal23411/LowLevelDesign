package com.example.design_patterns.strategy.concrete_classes;

import com.example.design_patterns.strategy.interfaces.Tallkable;

public class FastTalkable implements Tallkable {

    @Override
    public String talk() {
        return "i talk fast";
    }
}
