package com.sarada.designpatterns.StructuralDesignPattern.facadeDesignPattern;

public interface HotelKeeper {
  

  public VegMenu getVegMenu();
  public NonVegMenu getNonVegMenu();
  public Both getVegNonMenu();

}