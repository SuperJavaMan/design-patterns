package com.company.factory;

public class TableFactory implements FurnitureFactory{
    @Override
    public Furniture create() {
        return new Table("Glass", "White", "Round");
    }
}
