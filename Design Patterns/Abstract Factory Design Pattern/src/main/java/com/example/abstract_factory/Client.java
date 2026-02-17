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
import com.example.abstract_factory.objects.interfaces.MenuItem;

public class Client {

    public static void main(String[] args) {
        FastFoodFactory burgerKing = new BurgerKing();
        FastFoodFactory kfc = new Kfc();

        List<MenuItem> orders = new ArrayList<>();
        orders.add(burgerKing.createBurger(BurgerType.DOUBLE_PATTY_BURGER));
        orders.add(burgerKing.createBurger(BurgerType.PREMIUM_BURGER));
        orders.add(burgerKing.createBurger(BurgerType.SIMPLE_BURGER));

        orders.add(kfc.createBurger(BurgerType.DOUBLE_PATTY_BURGER));
        orders.add(kfc.createBurger(BurgerType.SIMPLE_BURGER));

        orders.add(burgerKing.createBread(BreadType.PITA));
        orders.add(burgerKing.createBread(BreadType.SOUR_DOUGH));
        orders.add(kfc.createBread(BreadType.PITA));
        orders.add(kfc.createBread(BreadType.SOUR_DOUGH));

        for (MenuItem item : orders){
            item.prepare();
        }
    }

}
