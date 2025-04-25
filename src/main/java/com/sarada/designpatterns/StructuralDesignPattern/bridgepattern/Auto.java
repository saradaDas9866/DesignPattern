package com.sarada.designpatterns.StructuralDesignPattern.bridgepattern;

// Refine abstraction 1 in bridge pattern
public class Auto extends Vehicle {
    public Auto(Workshop workShop1, Workshop workShop2)
    {
        super(workShop1, workShop2);
    }

    @Override
    public void manufacture()
    {
        System.out.print("Auto ");
        workShop1.work();
        workShop2.work();
    }
}
