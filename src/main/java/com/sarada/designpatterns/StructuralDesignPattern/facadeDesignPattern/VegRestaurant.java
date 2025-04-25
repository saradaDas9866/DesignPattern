package com.sarada.designpatterns.StructuralDesignPattern.facadeDesignPattern;

public class VegRestaurant implements Hotel {

    public Menus getMenus()
    {
        return new VegMenu();
    }
}