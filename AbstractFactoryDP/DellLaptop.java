package com.Vyshnavi.AbstractFactoryDP;

public class DellLaptop extends Laptop {

    public DellLaptop(Location location) {
        super(LapType.DELL,location);
        build();
    }

    @Override
    protected void build() {
        System.out.println(("Building DELL Laptop in "+this.getLocation()));
    }
}
