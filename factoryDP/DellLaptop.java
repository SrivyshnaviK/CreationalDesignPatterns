package com.Vyshnavi.factoryDP;
public class DellLaptop extends Laptop {

    public DellLaptop() {
        super(lapType.DELL);
        build();
    }

    @Override
    protected void build() {
        System.out.println(("Building DELL Laptop"));
    }
}
