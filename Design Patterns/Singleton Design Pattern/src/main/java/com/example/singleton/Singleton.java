package com.example.singleton;

public class Singleton {

    private static Singleton singletonInstance;

    private Singleton() {
        if (singletonInstance != null) {
            throw new IllegalAccessError("You are not supposed to call this constuctor after object creation");
        }
    }

    public static Singleton getInstance() {

        if (singletonInstance == null) {
            synchronized (Singleton.class) {
                if (singletonInstance == null) {
                    singletonInstance = new Singleton();
                }
            }
        }
        return singletonInstance;
    }

}
