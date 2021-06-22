package com.Vyshnavi.AbstractFactoryDP;

public class HPLaptop extends Laptop {
    public HPLaptop(Location location) {
        super(LapType.HP,location);
        build();
    }
    @Override
    protected void build() {
        System.out.println(("Building HP Laptop in "+this.getLocation()));
    }
}
