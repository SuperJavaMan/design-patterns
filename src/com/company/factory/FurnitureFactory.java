package com.company.factory;

/*
    Корневой класс параллельной иерархии.
     Обычно с одним методом общим для всей иерархии.
     Наследники переопределяют метод и возвращает объект за создание которого он отвечает.
 */
public interface FurnitureFactory {
    Furniture create();
}
