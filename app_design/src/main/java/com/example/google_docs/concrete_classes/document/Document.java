package com.example.google_docs.concrete_classes.document;

import java.util.ArrayList;
import java.util.List;

import com.example.google_docs.interfaces.Element;

import lombok.Getter;

@Getter
public class Document {
    private List<Element> elements= new ArrayList<>();

    public void addElements(Element e){
        elements.add(e);
    }

    public void render() {
        for(Element curElement: elements){
            System.out.print(curElement.render());
        }
        System.out.println();
    }

}
