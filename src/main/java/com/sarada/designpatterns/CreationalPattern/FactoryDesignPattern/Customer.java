package com.sarada.designpatterns.CreationalPattern.FactoryDesignPattern;

public class Customer {
    private final Vehicle pVehicle;

    public Customer(VehicleFactory factory) {
        pVehicle = factory.createVehicle();
    }

    public Vehicle getVehicle() {
        return pVehicle;
    }
}

