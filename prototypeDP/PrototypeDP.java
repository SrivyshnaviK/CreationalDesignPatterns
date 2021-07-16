package com.Vyshnavi.prototypeDP;

public class PrototypeDP {
    public static void main(String[] args) {
        try
        {
          PrototypeCapable object;
          object=PrototypeFactory.getInstance("Image");
            System.out.println(object);
          object=PrototypeFactory.getInstance("Track");
            System.out.println(object);
            object=PrototypeFactory.getInstance("File");
            System.out.println(object);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
