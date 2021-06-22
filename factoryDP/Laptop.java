package com.Vyshnavi.factoryDP;

public abstract class Laptop {
    private lapType model;
    public Laptop(lapType l)
    {
        this.model=l;
    }
    public void setModel(lapType model) {
        this.model = model;
    }
    public lapType getModel() {
        return this.model;
    }
    protected abstract void build();
}
