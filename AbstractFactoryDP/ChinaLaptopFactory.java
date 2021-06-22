package com.Vyshnavi.AbstractFactoryDP;

public class ChinaLaptopFactory {
    public static Laptop buildLaptop(LapType lapType)
    {
        Laptop laptop =null;
        switch(lapType)
        {
            case DELL:
                laptop=new DellLaptop(Location.CHINA);
                break;
            case HP:
                laptop=new HPLaptop(Location.CHINA);
                break;
            case MAC:
                laptop=new MACLaptop(Location.CHINA);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + lapType);
        }
        return laptop;
    }
}
