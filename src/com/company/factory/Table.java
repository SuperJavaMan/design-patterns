package com.company.factory;

public class Table extends Furniture {
    private String form;

    public Table(String material, String color, String form) {
        super(material, color);
        this.form = form;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    @Override
    public String toString() {
        return "Table{" +
                "form='" + form + '\'' +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
