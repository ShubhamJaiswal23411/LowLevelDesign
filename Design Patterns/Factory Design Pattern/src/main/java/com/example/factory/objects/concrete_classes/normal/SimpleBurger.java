package com.example.factory.objects.concrete_classes.normal;

import com.example.factory.objects.interfaces.Burger;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SimpleBurger implements Burger {

    @Override
    public void prepareBurger() {
        log.info("Creating simple burger");
    }

}
