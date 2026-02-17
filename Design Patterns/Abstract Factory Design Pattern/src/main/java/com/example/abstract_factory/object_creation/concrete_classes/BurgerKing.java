package com.example.abstract_factory.object_creation.concrete_classes;

import com.example.abstract_factory.enums.BreadType;
import com.example.abstract_factory.enums.BurgerType;
import com.example.abstract_factory.object_creation.interfaces.FastFoodFactory;
import com.example.abstract_factory.objects.concrete_classes.normal_bread.PitaBread;
import com.example.abstract_factory.objects.concrete_classes.normal_bread.SourDoughBread;
import com.example.abstract_factory.objects.concrete_classes.normal_burger.DoublePattyBurger;
import com.example.abstract_factory.objects.concrete_classes.normal_burger.PremiumBurger;
import com.example.abstract_factory.objects.concrete_classes.normal_burger.SimpleBurger;
import com.example.abstract_factory.objects.interfaces.Bread;
import com.example.abstract_factory.objects.interfaces.Burger;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BurgerKing implements FastFoodFactory {
    
    public BurgerKing() {
        log.info("Welcome to BurgerKing");
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

    @Override
    public Bread createBread(BreadType type) {
        if (type == BreadType.PITA) {
            return new PitaBread();
        } 
        return new SourDoughBread();
    }

}
