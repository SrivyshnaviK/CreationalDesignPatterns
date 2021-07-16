package com.Vyshnavi.prototypeDP;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
    private final static Map<String,PrototypeCapable> prototypes=new HashMap<>();
    static {
        prototypes.put("Image",new Image());
        prototypes.put("Track",new Track());
        prototypes.put("File",new File());
    }
    public static PrototypeCapable getInstance(String string) throws CloneNotSupportedException {
               return prototypes.get(string).cloneObject();
    }
}
