package com.Vyshnavi.prototypeDP;

public class File implements PrototypeCapable{
    @Override
    public PrototypeCapable cloneObject() throws CloneNotSupportedException {
        System.out.println("Cloning File Object...");
        return (PrototypeCapable) super.clone();
    }
    @Override
    public String toString()
    {
        return "File Object";
    }
}
