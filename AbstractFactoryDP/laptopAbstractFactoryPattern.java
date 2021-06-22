package com.Vyshnavi.AbstractFactoryDP;

public class laptopAbstractFactoryPattern {
    public static void main(String[] args) {
        System.out.println(LaptopFactory.buildLaptop(LapType.DELL));
        System.out.println(LaptopFactory.buildLaptop(LapType.HP));
        System.out.println(LaptopFactory.buildLaptop(LapType.MAC));
    }
}
