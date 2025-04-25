package com.sarada.designpatterns.CreationalPattern.BuilderDesignPattern;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Computer {
    private String cpu;
    private String ram;
    private String storage;

    public void displayInfo() {
        System.out.println("Computer Configuration:");
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + storage);
    }
}
