package com.example.factory.objects.concrete_classes.normal;

import com.example.factory.objects.interfaces.Burger;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PremiumBurger implements Burger {

    public PremiumBurger() {
        log.info("Creating premium burger");
    }

    @Override
    public Burger prepareBurger() {
        return new PremiumBurger();
    }

}
