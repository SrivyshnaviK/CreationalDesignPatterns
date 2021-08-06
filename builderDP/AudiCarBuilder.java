package com.Vyshnavi.builderDP;

public class AudiCarBuilder implements CarBuilder{
    private String name;

    public String getTypename() {
        return name;
    }
    AudiCarBuilder(String name){
        this.name=name;
        gatherSpareParts();
        integrateTechnology();
        manufactureBody();
        System.out.println(integratingBodyParts());
    }

    @Override
    public void gatherSpareParts() {
        System.out.println("Shipping "+name+" car type Spare Parts");
    }

    @Override
    public void integrateTechnology() {
        System.out.println("Integrating with display, sound system technologies");
    }

    @Override
    public void manufactureBody() {
        System.out.println("Manufacturing body parts.."+name);
    }

    @Override
    public String integratingBodyParts() {
        System.out.println("Arranging parts and engine");
        return name+" Car Built!!!";
    }
}
