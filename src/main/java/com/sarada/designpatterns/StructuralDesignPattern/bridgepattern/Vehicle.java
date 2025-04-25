package com.sarada.designpatterns.StructuralDesignPattern.bridgepattern;

// Java code to demonstrate
// bridge design pattern

// abstraction in bridge pattern
public abstract class Vehicle {
    protected Workshop workShop1;
    protected Workshop workShop2;

    protected Vehicle(Workshop workShop1, Workshop workShop2)
    {
        this.workShop1 = workShop1;
        this.workShop2 = workShop2;
    }

    abstract public void manufacture();
}
