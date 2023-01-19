package com.isvaso.solid.interfacesegregationprinciple;

/**
 * BAD
 */

public class OldFunctionPrinter implements Machine {

    @Override
    public void print(Document document) {

    }

    @Override
    public void fax(Document document) throws Exception {
        throw new Exception();
    }

    @Override
    public void scan(Document document) {

    }
}
