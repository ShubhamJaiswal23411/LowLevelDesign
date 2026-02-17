package com.example.factory;

import java.util.ArrayList;
import java.util.List;

import com.example.factory.enums.BurgerType;
import com.example.factory.object_creation.concrete_classes.KingBurgerFactory;
import com.example.factory.object_creation.concrete_classes.KingWheatBurgerFactory;
import com.example.factory.object_creation.interfaces.BurgerFactory;
import com.example.factory.objects.interfaces.Burger;

public class Client {

    public static void main(String[] args) {
        BurgerFactory burgerFactory = new KingBurgerFactory();
        BurgerFactory burgerFactory2 = new KingWheatBurgerFactory();


        List<Burger> orderList = new ArrayList<>();
        orderList.add(burgerFactory.createBurger(BurgerType.DOUBLE_PATTY_BURGER));
        orderList.add(burgerFactory.createBurger(BurgerType.PREMIUM_BURGER));
        orderList.add(burgerFactory.createBurger(BurgerType.SIMPLE_BURGER));
        

        orderList.add(burgerFactory2.createBurger(BurgerType.DOUBLE_PATTY_BURGER));
        orderList.add(burgerFactory2.createBurger(BurgerType.SIMPLE_BURGER));


        for(Burger curBurger : orderList){
            curBurger.prepareBurger();
        }

    }
    
}
