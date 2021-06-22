package com.Vyshnavi.AbstractFactoryDP;

public class IndiaLaptopFactory {
    public static Laptop buildLaptop(LapType lapType)
    {
        Laptop laptop =null;
        switch(lapType)
        {
            case DELL:
                laptop=new DellLaptop(Location.INDIA);
                break;
            case HP:
                laptop=new HPLaptop(Location.INDIA);
                break;
            case MAC:
                laptop=new MACLaptop(Location.INDIA);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + lapType);
        }
        return laptop;
    }
}
