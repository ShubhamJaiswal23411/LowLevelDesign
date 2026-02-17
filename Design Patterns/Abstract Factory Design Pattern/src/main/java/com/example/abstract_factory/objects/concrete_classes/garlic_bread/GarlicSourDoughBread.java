package com.example.abstract_factory.objects.concrete_classes.garlic_bread;

import com.example.abstract_factory.objects.interfaces.Bread;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GarlicSourDoughBread implements Bread {

    @Override
    public void prepare() {
        log.info("Preparing sour dough bread with garlic");

    }
}
