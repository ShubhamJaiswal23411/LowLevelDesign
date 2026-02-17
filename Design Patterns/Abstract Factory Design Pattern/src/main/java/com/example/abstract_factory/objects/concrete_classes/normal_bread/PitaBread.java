package com.example.abstract_factory.objects.concrete_classes.normal_bread;

import com.example.abstract_factory.objects.interfaces.Bread;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PitaBread implements Bread {
    @Override
    public void prepare() {
        log.info("Preparing pita bread without garlic");
    }

}
