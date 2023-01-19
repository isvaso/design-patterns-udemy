package com.isvaso.solid.interfacesegregationprinciple;

/**
 * BAD
 */

public class MultiFunctionPrinter implements Machine {

    @Override
    public void print(Document document) {
        //
    }

    @Override
    public void fax(Document document) {
        //
    }

    @Override
    public void scan(Document document) {
        //
    }
}
