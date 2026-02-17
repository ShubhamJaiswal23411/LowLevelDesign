package com.example.factory.object_creation.interfaces;

import com.example.factory.enums.BurgerType;
import com.example.factory.objects.interfaces.Burger;

public interface BurgerFactory {
    public Burger createBurger(BurgerType type);
}
