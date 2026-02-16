package com.example.strategy.concrete_classes;

import com.example.strategy.interfaces.Tallkable;

public class FastTalkable implements Tallkable {

    @Override
    public String talk() {
        return "i talk fast";
    }
}
