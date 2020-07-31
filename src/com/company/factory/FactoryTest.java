package com.company.factory;

import java.util.Arrays;
import java.util.List;

public class FactoryTest {
    public static void main(String[] args) {
        List<FurnitureFactory> furnitureList = Arrays.asList(new ChairFactory(), new TableFactory());
        furnitureList.forEach(FactoryTest::printFurnitureInfo);
    }

    private static void printFurnitureInfo(FurnitureFactory furnitureFactory) {
        Furniture furniture = furnitureFactory.create();
        System.out.println(furniture);
    }
}
