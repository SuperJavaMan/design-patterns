package com.company.factory;

public class ChairFactory implements FurnitureFactory {

    // Переопределяем метод и возвращаем стул.
    // Мы здесь сами конструируем объект и возвращаем готовый объект,
    // клиент не должен знать не о конкретном типе, ни беспокоится о конструкторе
    @Override
    public Furniture create() {
        return new Chair("Wood", "Brown", 3);
    }
}
