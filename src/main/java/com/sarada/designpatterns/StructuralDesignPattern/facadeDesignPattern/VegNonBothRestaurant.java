package com.sarada.designpatterns.StructuralDesignPattern.facadeDesignPattern;

public class VegNonBothRestaurant implements Hotel {

    public Menus getMenus()
    {
        return new Both();
    }
}