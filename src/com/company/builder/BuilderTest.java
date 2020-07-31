package com.company.builder;

public class BuilderTest {
    public static void main(String[] args) {
        // Получаем замок по умолчанию
        Castle castle1 = Castle.newBuilder().build();
        System.out.println(castle1);

        // Можем настроить несколько полей замка, а остальные будут по умолчанию
        Castle castle2 = Castle.newBuilder()
                .setCastleName("<<<Awesome castle>>>")
                .build();
        System.out.println(castle2);

        // Можно построить полностью кастомный замок
        Castle castle3 = Castle.newBuilder()
                .setCastleName("Mordor")
                .setCastleArea(100)
                .setWallType(Castle.WallType.STONE)
                .build();
        System.out.println(castle3);
    }
}
