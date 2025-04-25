package com.sarada.designpatterns.CreationalPattern.PrototypeDesignPattern;

public interface Shape {
    Shape clone();  // Make a copy of itself
    void draw();    // Draw the shape
}