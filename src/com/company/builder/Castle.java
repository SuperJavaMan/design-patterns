package com.company.builder;

/*
    Создаем класс, который мы будем стороить.
    Инициализируем поля по умолчанию, если нужно.
 */
public class Castle {
    private String name = "New Castle";
    private WallType wallType = WallType.WOODEN;
    private int area = 10;

    enum WallType {
        WOODEN, STONE, STEEL
    }

    // Делаем конструктор приватным, чтобы замок никто кроме билдера не мог вернуть
    private Castle() {}

    public String getName() {
        return name;
    }

    public WallType getWallType() {
        return wallType;
    }

    public int getArea() {
        return area;
    }

    // Пишим статический метод для получения билдера
    public static Builder newBuilder() {
        return new Castle().new Builder();
    }

    @Override
    public String toString() {
        return "Castle{" +
                "name='" + name + '\'' +
                ", wallType=" + wallType +
                ", area=" + area +
                '}';
    }

    // Сам билдер, который и будет конструировать наш замок и возвраащать его экземпляр
    class Builder {
        // Делаем конструктор приватным, чтобы никто не мог получить билдера
        // в обход статического метода замка написанного выше
        private Builder() {}

        // Каждый метод билдера отвечает за одно поле замка
        // и возвращает самого себя
        public Builder setCastleName(String name) {
            Castle.this.name = name;
            return this;
        }

        public Builder setWallType(WallType type) {
            Castle.this.wallType = type;
            return this;
        }

        public Builder setCastleArea(int area) {
            Castle.this.area = area;
            return this;
        }

        // Этот метод возвращает готовый объект замка
        // в конце его постройки билдером
        public Castle build() {
            return Castle.this;
        }
    }
}
