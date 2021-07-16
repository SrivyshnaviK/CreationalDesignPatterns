package com.Vyshnavi.prototypeDP;

public class Image implements PrototypeCapable{

    @Override
    public Image cloneObject() throws CloneNotSupportedException {
        System.out.println("Cloning Image Object...");
        return (Image) super.clone();
    }
    @Override
    public String toString()
    {
        return "Image Object";
    }
}
