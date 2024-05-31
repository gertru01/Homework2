package ru.gertru;

public class Task3 {
    public static void main(String[] args) {

        Item item1 = new Item("Банка", "AN235-940-34", "Черный", 250.5, 5, false);
        System.out.println(item1.art + " - " + item1.name + " - " + item1.price + " - " + item1.number + " - " + item1.color + " - " + item1.isOrganic);

        Item item2 = new Item("Самолет", "JK456-736-73", "Желтый", 45670.0, 1, false);
        System.out.println(item2.art + " - " + item2.name + " - " + item2.price + " - " + item2.number + " - " + item2.color + " - " + item2.isOrganic);

        Item item3 = new Item("Пакет бумажный", "BP209-129-70", "Коричневый", 199.99, 100, true);
        System.out.println(item3.art + " - " + item3.name + " - " + item3.price + " - " + item3.number + " - " + item3.color + " - " + item3.isOrganic);

        Item item4 = new Item("Колонки", "TY235-944-56", "Черный", 2500.0, 2, false);
        System.out.println(item4.art + " - " + item4.name + " - " + item4.price + " - " + item4.number + " - " + item4.color + " - " + item4.isOrganic);

        Item item5 = new Item("Банка", "AN985-948-33", "Белый", 750.5, 1, false);
        System.out.println(item5.art + " - " + item5.name + " - " + item5.price + " - " + item5.number + " - " + item5.color + " - " + item5.isOrganic);
    }
}
