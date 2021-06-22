package com.Vyshnavi.AbstractFactoryDP;

public class LaptopFactory {
    public static Laptop buildLaptop(LapType lapType)
    {
        Laptop laptop =null;
        Location location=Location.INDIA;
        switch(location)
        {
            case INDIA:
                laptop=IndiaLaptopFactory.buildLaptop(lapType);
                break;
            case CHINA:
                laptop=ChinaLaptopFactory.buildLaptop(lapType);
                break;
            case OTHER:
                laptop=OtherLaptopFactory.buildLaptop(lapType);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + lapType);
        }
        return laptop;
    }
}
