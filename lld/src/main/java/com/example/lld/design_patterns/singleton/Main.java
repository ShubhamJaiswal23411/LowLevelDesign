package com.example.lld.design_patterns.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

    private static Constructor<?>[] constructors;

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        SingletonEager s1 = SingletonEager.getInstance();
        SingletonEager s2 = SingletonEager.getInstance();

        Constructor<SingletonEager> declaredConstructor = SingletonEager.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        SingletonEager newInstance = declaredConstructor.newInstance();

        System.out.println(s1==s2);
    }

}
