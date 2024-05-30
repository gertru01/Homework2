package ru.gertru;

public class Task3 {
    public static void main(String[] args) {

        Item item = new Item("Банка", "AN235-940-34", "Черный", 250.5, 5, false);
        System.out.println(item.art + " - " + item.name + " - " + item.price + " - " + item.number + " - " + item.color + " - " + item.isOrganic);
    }
}
