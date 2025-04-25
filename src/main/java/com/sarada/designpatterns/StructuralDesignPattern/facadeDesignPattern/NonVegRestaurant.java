package com.sarada.designpatterns.StructuralDesignPattern.facadeDesignPattern;

public class NonVegRestaurant implements Hotel {

    public Menus getMenus()
    {
        return new NonVegMenu();
    }
}