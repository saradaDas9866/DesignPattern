package com.sarada.designpatterns.CreationalPattern.BuilderDesignPattern;

public class GamingComputerBuilder implements Builder {
    private Computer computer;

    public GamingComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildCPU() {
        computer.setCpu("Gaming CPU");
    }

    @Override
    public void buildRAM() {
        computer.setRam("32GB DDR4");
    }

    @Override
    public void buildStorage() {
        computer.setStorage("1TB SSD");
    }

    @Override
    public Computer getResult() {
        return computer;
    }
}
