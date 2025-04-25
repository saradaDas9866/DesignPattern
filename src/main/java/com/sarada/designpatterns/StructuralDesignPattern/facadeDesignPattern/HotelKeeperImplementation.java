package com.sarada.designpatterns.StructuralDesignPattern.facadeDesignPattern;

public class HotelKeeperImplementation implements HotelKeeper {

    public VegMenu getVegMenu()
    {
        VegRestaurant v = new VegRestaurant();
        return (VegMenu)v.getMenus();
    }

    public NonVegMenu getNonVegMenu()
    {
        NonVegRestaurant v = new NonVegRestaurant();
        return (NonVegMenu)v.getMenus();
    }

    public Both getVegNonMenu()
    {
        VegNonBothRestaurant v = new VegNonBothRestaurant();
        return (Both)v.getMenus();
    }
}