package com.Vyshnavi.AbstractFactoryDP;

public class OtherLaptopFactory {
    public static Laptop buildLaptop(LapType lapType)
    {
        Laptop laptop =null;
        switch(lapType)
        {

            case DELL:
                laptop=new DellLaptop(Location.OTHER);
                break;
            case HP:
                laptop=new HPLaptop(Location.OTHER);
                break;
            case MAC:
                laptop=new MACLaptop(Location.OTHER);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + lapType);
        }
        return laptop;
    }
}
