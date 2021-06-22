package com.Vyshnavi.factoryDP;

public class LaptopFactory {
    public static Laptop buildLaptop(lapType lt)
    {
        Laptop l =null;
        switch(lt)
        {

            case DELL:
                l=new DellLaptop();
                break;
            case HP:
                l=new HPLaptop();
                break;
            case MAC:
                l=new MACLaptop();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + lt);
        }
        return l;
    }
}
