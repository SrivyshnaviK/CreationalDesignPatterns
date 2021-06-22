package com.Vyshnavi.AbstractFactoryDP;

public abstract class Laptop {
    private LapType model=null;
    private Location location=null;
    public Laptop(LapType lapType, Location location)
    {
        this.model=lapType;
        this.location=location;
    }
    public void setModel(LapType model) {
        this.model = model;
    }
    public LapType getModel() {
        return this.model;
    }
    public void setLocation(Location location){this.location=location;}
    public Location getLocation(){return this.location;}
    public String toString() {
        return "Model- "+model + " built in "+location;
    }
    protected abstract void build();
}
