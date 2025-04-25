package com.sarada.designpatterns.CreationalPattern.BuilderDesignPattern;

interface Builder {
    void buildCPU();
    void buildRAM();
    void buildStorage();
    Computer getResult();
}
