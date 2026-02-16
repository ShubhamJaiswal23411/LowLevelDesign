package com.example.google_docs.concrete_classes.document;

import com.example.google_docs.interfaces.Element;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Image implements Element{

    private final String path ;
    
    public Image(String path) {
        this.path = path;
    }

    @Override
    public String render() {
        return this.path;
    }
    
}
