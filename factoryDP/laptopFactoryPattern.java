package com.Vyshnavi.factoryDP;

public class laptopFactoryPattern {
    public static void main(String[] args) {
        System.out.println(LaptopFactory.buildLaptop(lapType.DELL));
        System.out.println(LaptopFactory.buildLaptop(lapType.HP));
        System.out.println(LaptopFactory.buildLaptop(lapType.MAC));

    }
}
