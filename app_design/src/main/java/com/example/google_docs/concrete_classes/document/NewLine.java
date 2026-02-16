package com.example.google_docs.concrete_classes.document;

import com.example.google_docs.interfaces.Element;

public class NewLine implements Element{

    @Override
    public String render() {
        return "\n";
    }
    
}
