package com.example.google_docs.concrete_classes.persistance;

import com.example.google_docs.interfaces.Persistance;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SaveToDb implements Persistance{

    @Override
    public void save() {
        System.out.println("Document saved to db");
    }
    
}
