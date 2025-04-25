package com.sarada.designpatterns.CreationalPattern.FactoryDesignPattern;

public class FourWheelerFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new FourWheeler();
    }
}
