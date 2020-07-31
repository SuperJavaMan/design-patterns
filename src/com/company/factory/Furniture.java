package com.company.factory;
/*
    Корневой класс целевой иерархии классов, которые фабрики будут создавать.
 */
public abstract class Furniture {
    protected String material;
    protected String color;

    public Furniture(String material, String color) {
        this.material = material;
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
