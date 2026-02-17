package com.example.factory.objects.concrete_classes.normal;

import com.example.factory.objects.interfaces.Burger;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SimpleBurger implements Burger {

    public SimpleBurger() {
        log.info("Creating simple burger");
    }

    @Override
    public Burger prepareBurger() {
        return new SimpleBurger();
    }

}
