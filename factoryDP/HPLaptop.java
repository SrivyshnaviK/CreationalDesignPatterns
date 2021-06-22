package com.Vyshnavi.factoryDP;

public class HPLaptop extends Laptop {
    public HPLaptop() {
        super(lapType.HP);
        build();
    }

    @Override
    protected void build() {
        System.out.println(("Building HP Laptop"));
    }
}
