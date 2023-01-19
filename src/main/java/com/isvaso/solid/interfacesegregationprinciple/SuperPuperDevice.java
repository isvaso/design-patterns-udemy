package com.isvaso.solid.interfacesegregationprinciple;

public class SuperPuperDevice implements MultiFunctionDevice {

    private final Printer printer;
    private final Scanner scanner;

    public SuperPuperDevice(Printer printer, Scanner scanner) {
        this.printer = printer;
        this.scanner = scanner;
    }

    @Override
    public void print(Document document) {
        printer.print(document);
    }

    @Override
    public void scan(Document document) {
        scanner.scan(document);
    }
}
