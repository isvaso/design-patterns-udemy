package com.isvaso.solid.interfacesegregationprinciple;

/**
 * BAD
 */

public interface Machine {

    void print(Document document);
    void fax(Document document) throws Exception;
    void scan(Document document);
}
