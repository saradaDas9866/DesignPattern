package com.sarada.designpatterns.CreationalPattern.FactoryDesignPattern;

public class TwoWheelerFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new TwoWheeler();
    }
}
