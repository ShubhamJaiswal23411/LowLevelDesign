package com.example.abstract_factory.objects.concrete_classes.normal_burger;

import com.example.abstract_factory.objects.interfaces.Burger;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DoublePattyBurger implements Burger {

    @Override
    public void prepareBurger() {
        log.info("Creating double patty burger");
    }

}
