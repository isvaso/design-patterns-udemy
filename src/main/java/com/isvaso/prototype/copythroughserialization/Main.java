package com.isvaso.prototype.copythroughserialization;

import org.apache.commons.lang3.SerializationUtils;

public class Main {

    public static void main(String[] args) {
        Foo f1 = new Foo(42, "life");
        Foo f2 = SerializationUtils.roundtrip(f1);
        f2.stuff = 111;

        System.out.println(f1);
        System.out.println(f2);
    }
}
