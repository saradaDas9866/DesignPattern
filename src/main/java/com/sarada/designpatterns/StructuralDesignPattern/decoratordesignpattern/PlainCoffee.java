package com.sarada.designpatterns.StructuralDesignPattern.decoratordesignpattern;

// PlainCoffee.java
public class PlainCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Plain Coffee";
    }

    @Override
    public double getCost() {
        return 2.0;
    }
}