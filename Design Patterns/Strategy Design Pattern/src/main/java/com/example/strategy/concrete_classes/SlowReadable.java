package com.example.strategy.concrete_classes;

import com.example.strategy.interfaces.Readable;

public class SlowReadable implements Readable {

    @Override
    public String read() {
        return "i read slowly";
    }

}
