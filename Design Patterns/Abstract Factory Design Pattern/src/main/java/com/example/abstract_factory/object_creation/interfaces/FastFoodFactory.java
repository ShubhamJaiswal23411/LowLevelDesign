package com.example.abstract_factory.object_creation.interfaces;

import com.example.abstract_factory.enums.BreadType;
import com.example.abstract_factory.enums.BurgerType;
import com.example.abstract_factory.objects.interfaces.Bread;
import com.example.abstract_factory.objects.interfaces.Burger;

public interface FastFoodFactory {
    public Burger createBurger(BurgerType type);
    public Bread createBread(BreadType bread);
}
