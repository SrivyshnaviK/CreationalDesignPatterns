package com.Vyshnavi.factoryDP;

public class MACLaptop extends Laptop {
    public MACLaptop() {
        super(lapType.MAC);
        build();
    }

    @Override
    protected void build() {
        System.out.println("Building MAC Laptop");
    }
}
