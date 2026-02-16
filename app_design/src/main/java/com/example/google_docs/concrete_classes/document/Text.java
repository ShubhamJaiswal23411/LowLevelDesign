package com.example.google_docs.concrete_classes.document;

import com.example.google_docs.interfaces.Element;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Text implements Element{

    private final String data;

    public Text(String data) {
        this.data = data;
    }

    @Override
    public String render() {
        return this.data;
    }
    
}
