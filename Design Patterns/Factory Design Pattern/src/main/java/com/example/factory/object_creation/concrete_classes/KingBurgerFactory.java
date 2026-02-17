package com.example.factory.object_creation.concrete_classes;

import com.example.factory.enums.BurgerType;
import com.example.factory.object_creation.interfaces.BurgerFactory;
import com.example.factory.objects.concrete_classes.normal.DoublePattyBurger;
import com.example.factory.objects.concrete_classes.normal.PremiumBurger;
import com.example.factory.objects.concrete_classes.normal.SimpleBurger;
import com.example.factory.objects.interfaces.Burger;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class KingBurgerFactory implements BurgerFactory {
    
    public KingBurgerFactory() {
        log.info("Welcome to king burger factory , this factory creates burgers with normal buns");
    }

    @Override
    public Burger createBurger(BurgerType type) {
        if (type == BurgerType.DOUBLE_PATTY_BURGER) {
            return new DoublePattyBurger();
        } else if (type == BurgerType.PREMIUM_BURGER) {
            return new PremiumBurger();
        }
        return new SimpleBurger();
    }

}
