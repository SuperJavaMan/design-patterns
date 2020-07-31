package com.company.factory;

public class Chair extends Furniture {
    private int legCount;

    public Chair(String material, String color, int legCount) {
        super(material, color);
        this.legCount = legCount;
    }

    public int getLegCount() {
        return legCount;
    }

    public void setLegCount(int legCount) {
        this.legCount = legCount;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "legCount=" + legCount +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
