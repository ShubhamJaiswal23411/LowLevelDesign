package com.example.factory.objects.concrete_classes.normal;

import com.example.factory.objects.interfaces.Burger;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DoublePattyBurger implements Burger {

    @Override
    public void prepareBurger() {
        log.info("Creating double patty burger");
    }

}
