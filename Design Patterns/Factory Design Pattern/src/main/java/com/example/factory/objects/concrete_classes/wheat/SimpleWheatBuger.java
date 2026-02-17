package com.example.factory.objects.concrete_classes.wheat;

import com.example.factory.objects.interfaces.Burger;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SimpleWheatBuger implements Burger{

    @Override
    public void prepareBurger() {
        log.info("Creating a Simple wheat burger");
    }
    
}
