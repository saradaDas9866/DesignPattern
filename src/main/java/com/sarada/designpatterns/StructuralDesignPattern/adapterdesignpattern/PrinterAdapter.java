package com.sarada.designpatterns.StructuralDesignPattern.adapterdesignpattern;

import org.springframework.beans.factory.annotation.Autowired;

public class PrinterAdapter implements Printer {

    private final LegacyPrinter legacyPrinter = new LegacyPrinter();

    @Override
    public void print()  {
        legacyPrinter.printDocument();
    }

}
