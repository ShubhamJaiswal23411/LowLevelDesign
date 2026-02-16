package com.example.google_docs.concrete_classes;

import com.example.google_docs.concrete_classes.document.Document;
import com.example.google_docs.concrete_classes.document.Image;
import com.example.google_docs.concrete_classes.document.NewLine;
import com.example.google_docs.concrete_classes.document.Tab;
import com.example.google_docs.concrete_classes.document.Text;
import com.example.google_docs.concrete_classes.persistance.SaveToDb;
import com.example.google_docs.concrete_classes.persistance.SaveToS3;
import com.example.google_docs.interfaces.Element;
import com.example.google_docs.interfaces.Persistance;

public class DocumentHandler {
    Document doc;
    Persistance persistance;

    public DocumentHandler(String save){
        this.doc = new Document();
        if(save.equalsIgnoreCase("savetodb")){
            this.persistance=new SaveToDb();
        }else{
            this.persistance= new SaveToS3();
        }
    }

    public void addText(String data){
        Element text = new Text(data);
        doc.addElements(text);
    }
    public void addImage(String imagePath){
        Element image = new Image(imagePath);
        doc.addElements(image);
    }
    public void addNewLine(){
        Element newLineElement = new NewLine();
        doc.addElements(newLineElement);
    }
    public void addTab(){
        Element tabElement = new Tab();
        doc.addElements(tabElement);
    }

    public void renderDoc(){
        doc.render();
    }

    public void save(){
        persistance.save();
    }



    public static void main(String[] args) {
        DocumentHandler documentHandler = new DocumentHandler("savetodb");
        DocumentHandler documentHandler2 = new DocumentHandler("savetos3");
        documentHandler.addImage("dog.png");
        documentHandler.addNewLine();
        documentHandler.addTab();
        documentHandler.addText("OMG that dog is too cute");
        documentHandler.addTab();
        documentHandler.addText("!!!!!");
        documentHandler.renderDoc();
        documentHandler.save();
    }

}
