package com.epam.patterns.prototype;

public abstract class PrototypeCapable implements Cloneable {

     @Override
     public abstract PrototypeCapable clone();
}
