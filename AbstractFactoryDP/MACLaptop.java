package com.Vyshnavi.AbstractFactoryDP;

public class MACLaptop extends Laptop {
    public MACLaptop(Location location) {
        super(LapType.MAC, location);
        build();
    }
    @Override
    protected void build() {
        System.out.println("Building MAC Laptop in "+this.getLocation());
    }
}
