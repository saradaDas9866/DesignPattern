package com.sarada.designpatterns.CreationalPattern.AbstractDesignPattern;

class EuropeSpecification implements CarSpecification {
    @Override
    public void display() {
        System.out.println("Europe Car Specification: Fuel efficiency and emissions compliant with EU standards.");
    }
}
