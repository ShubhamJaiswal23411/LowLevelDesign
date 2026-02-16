package com.example.strategy.concrete_classes;

import com.example.strategy.interfaces.Readable;

public class FastReadable implements Readable {

    @Override
    public String read() {
        return "i read fast";
    }

}
