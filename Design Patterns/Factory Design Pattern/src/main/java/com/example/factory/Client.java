package com.example.factory;

import com.example.factory.enums.BurgerType;
import com.example.factory.object_creation.concrete_classes.KingBurgerFactory;
import com.example.factory.object_creation.concrete_classes.KingWheatBurgerFactory;
import com.example.factory.object_creation.interfaces.BurgerFactory;

public class Client {

    public static void main(String[] args) {
        BurgerFactory burgerFactory = new KingBurgerFactory();
        BurgerFactory burgerFactory2 = new KingWheatBurgerFactory();
        burgerFactory.createBurger(BurgerType.DOUBLE_PATTY_BURGER);
        burgerFactory.createBurger(BurgerType.PREMIUM_BURGER);
        burgerFactory.createBurger(BurgerType.SIMPLE_BURGER);
        

        burgerFactory2.createBurger(BurgerType.DOUBLE_PATTY_BURGER);
        burgerFactory2.createBurger(BurgerType.SIMPLE_BURGER);
        

    }
    
}
