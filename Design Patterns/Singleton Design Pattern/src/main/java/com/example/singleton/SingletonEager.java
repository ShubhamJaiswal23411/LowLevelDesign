package com.example.singleton;

public class SingletonEager {

    private static final SingletonEager instance = new SingletonEager();

    private SingletonEager() {
        if (this.instance != null){
            try {
                throw new IllegalAccessException();
            } catch (IllegalAccessException ex) {
                System.out.println("You are trying to access this private constructor don't do that shit!! you sneaky little bastard, use the getInstance method since the object already exists");
            }
        }else{
            System.out.println("Creating singleton object");
        }
    }

    public static SingletonEager getInstance() {
        return instance;
    }

}
