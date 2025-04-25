package com.sarada.designpatterns.CreationalPattern.SingletonPattern;

public class SingleTon {
    private static SingleTon instance;

    private SingleTon()
    {
        System.out.println("Singleton is Instantiated.");
    }

    public static SingleTon getInstance()
    {
        if (instance == null) {
            instance = new SingleTon();
        }
        return instance;
    }

    public static void doSomething()
    {
        System.out.println("Somethong is Done.");
    }
}
