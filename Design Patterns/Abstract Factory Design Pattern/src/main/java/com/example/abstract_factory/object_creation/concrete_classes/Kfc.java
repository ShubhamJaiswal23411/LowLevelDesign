package com.example.abstract_factory.object_creation.concrete_classes;

import com.example.abstract_factory.enums.BreadType;
import com.example.abstract_factory.enums.BurgerType;
import com.example.abstract_factory.object_creation.interfaces.FastFoodFactory;
import com.example.abstract_factory.objects.concrete_classes.garlic_bread.GarlicPitaBread;
import com.example.abstract_factory.objects.concrete_classes.garlic_bread.GarlicSourDoughBread;
import com.example.abstract_factory.objects.concrete_classes.wheat_burger.DoublePattyWheatBurger;
import com.example.abstract_factory.objects.concrete_classes.wheat_burger.PremiumWheatBurger;
import com.example.abstract_factory.objects.concrete_classes.wheat_burger.SimpleWheatBuger;
import com.example.abstract_factory.objects.interfaces.Bread;
import com.example.abstract_factory.objects.interfaces.Burger;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Kfc implements FastFoodFactory{

    public Kfc() {
        log.info("Welcome to kfc");
    }

    @Override
    public Burger createBurger(BurgerType type) {
        if(type==BurgerType.DOUBLE_PATTY_BURGER){
            return new DoublePattyWheatBurger();
        }else if(type==BurgerType.PREMIUM_BURGER){
            return new PremiumWheatBurger();
        }
        return new SimpleWheatBuger();
    }

    @Override
    public Bread createBread(BreadType type) {
        if (type == BreadType.PITA) {
            return new GarlicPitaBread();
        } 
        return new GarlicSourDoughBread();
    }
    
}
