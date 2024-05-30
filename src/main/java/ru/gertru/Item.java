package ru.gertru;

public class Item {

    String name;
    String art;
    String color;
    double price;
    int number;
    boolean isOrganic;

    public Item(String name, String art, String color, double price, int number, boolean isOrganic) {

        this.color = color;
        this.art = art;
        this.isOrganic = isOrganic;
        this.name = name;
        this.number = number;
        this.price = price;
    }
}
