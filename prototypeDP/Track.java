package com.Vyshnavi.prototypeDP;

public class Track implements PrototypeCapable{
    @Override
    public Track cloneObject() throws CloneNotSupportedException {
        System.out.println("Cloning Track Object...");
        return (Track) super.clone();
    }
    @Override
    public String toString(){
        return "Track Object";
    }
}
