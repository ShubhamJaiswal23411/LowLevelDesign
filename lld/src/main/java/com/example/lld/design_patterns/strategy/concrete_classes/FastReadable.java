package com.example.lld.design_patterns.strategy.concrete_classes;

import com.example.lld.design_patterns.strategy.interfaces.Readable;

public class FastReadable implements Readable {

    @Override
    public String read() {
        return "i read fast";
    }

}
