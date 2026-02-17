package com.example.abstract_factory;

import java.util.ArrayList;
import java.util.List;

import com.example.abstract_factory.enums.BreadType;
import com.example.abstract_factory.enums.BurgerType;
import com.example.abstract_factory.object_creation.concrete_classes.BurgerKing;
import com.example.abstract_factory.object_creation.concrete_classes.Kfc;
import com.example.abstract_factory.object_creation.interfaces.FastFoodFactory;
import com.example.abstract_factory.objects.interfaces.Bread;
import com.example.abstract_factory.objects.interfaces.Burger;

public class Client {

    public static void main(String[] args) {
        FastFoodFactory burgerKing = new BurgerKing();
        FastFoodFactory kfc = new Kfc();

        List<Burger> bugerOrderList = new ArrayList<>();
        bugerOrderList.add(burgerKing.createBurger(BurgerType.DOUBLE_PATTY_BURGER));
        bugerOrderList.add(burgerKing.createBurger(BurgerType.PREMIUM_BURGER));
        bugerOrderList.add(burgerKing.createBurger(BurgerType.SIMPLE_BURGER));

        bugerOrderList.add(kfc.createBurger(BurgerType.DOUBLE_PATTY_BURGER));
        bugerOrderList.add(kfc.createBurger(BurgerType.SIMPLE_BURGER));

        for (Burger curBurger : bugerOrderList) {
            curBurger.prepareBurger();
        }

        List<Bread> breadOrderList = new ArrayList<>();
        breadOrderList.add(burgerKing.createBread(BreadType.PITA));
        breadOrderList.add(burgerKing.createBread(BreadType.SOUR_DOUGH));
        breadOrderList.add(kfc.createBread(BreadType.PITA));
        breadOrderList.add(kfc.createBread(BreadType.SOUR_DOUGH));

        for (Bread cuBread : breadOrderList){
            cuBread.prepareBread();
        }
    }

}
