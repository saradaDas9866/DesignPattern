package com.sarada.designpatterns.CreationalPattern.BuilderDesignPattern;

public class ComputerDirector {
    public void construct(Builder builder) {
        builder.buildCPU();
        builder.buildRAM();
        builder.buildStorage();
    }
}