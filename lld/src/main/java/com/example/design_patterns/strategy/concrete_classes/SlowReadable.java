package com.example.design_patterns.strategy.concrete_classes;

import com.example.design_patterns.strategy.interfaces.Readable;

public class SlowReadable implements Readable {

    @Override
    public String read() {
        return "i read slowly";
    }

}
