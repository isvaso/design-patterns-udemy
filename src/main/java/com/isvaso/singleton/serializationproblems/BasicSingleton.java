package com.isvaso.singleton.serializationproblems;

import java.io.Serializable;

public class BasicSingleton implements Serializable {

    private static final BasicSingleton INSTANCE = new BasicSingleton();
    private int value = 0;

    private BasicSingleton() {
    }

    public static BasicSingleton getInstance() {
        return INSTANCE;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    // Solving the problem of reading Singleton from a file

    /*From ObjectInputStream.java:
    Reads an "unshared" object from the ObjectInputStream.  This method is
    dentical to readObject, except that it prevents subsequent calls to
    readObject and readUnshared from returning additional references to the
    deserialized instance obtained via this call.  Specifically:
       - If readUnshared is called to deserialize a back-reference (the
         stream representation of an object which has been written
         previously to the stream), an ObjectStreamException will be thrown.
       - If readUnshared returns successfully, then any subsequent attempts
         to deserialize back-references to the stream handle deserialized
         by readUnshared will cause an ObjectStreamException to be thrown.

    Deserializing an object via readUnshared invalidates the stream handle
    associated with the returned object.  Note that this in itself does not
    always guarantee that the reference returned by readUnshared is unique;
    the deserialized object may define a readResolve method which returns an
    object visible to other parties, or readUnshared may return a Class
    object or enum constant obtainable elsewhere in the stream or through
    external means. If the deserialized object defines a readResolve method
    and the invocation of that method returns an array, then readUnshared
    returns a shallow clone of that array; this guarantees that the returned
    array object is unique and cannot be obtained a second time from an
    invocation of readObject or readUnshared on the ObjectInputStream,
    even if the underlying data stream has been manipulated.*/
    protected Object readResolve() {
        return INSTANCE;
    }
}
