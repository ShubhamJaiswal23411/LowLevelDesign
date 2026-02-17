package com.example.factory.objects.concrete_classes.wheat;

import com.example.factory.objects.interfaces.Burger;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PremiumWheatBurger implements Burger{

    public PremiumWheatBurger() {
        log.info("Creating a Premium wheat burger");
    }

    @Override
    public Burger prepareBurger() {
        return new PremiumWheatBurger();
    }
    
}
