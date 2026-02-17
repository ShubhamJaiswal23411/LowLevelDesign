package com.example.factory.objects.concrete_classes.wheat;

import com.example.factory.objects.interfaces.Burger;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DoublePattyWheatBurger implements Burger {

    public DoublePattyWheatBurger() {
        log.info("Creating a Double patty wheat burger");
    }

    @Override
    public Burger prepareBurger() {
        return new DoublePattyWheatBurger();
    }

}
