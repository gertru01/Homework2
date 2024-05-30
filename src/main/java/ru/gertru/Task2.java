package ru.gertru;

public class Task2 {
    public static void main(String[] args) {

        Flat flat = new Flat();
        flat.height = 2.8;
        flat.isStudioApartment = false;
        flat.sqr = 68.0;
        flat.roomNumber = 2;
        System.out.println(flat.roomNumber + "-комнатная квартира \n" + "Площадь квартиры: " + flat.sqr + " м^2\n" + "Высота потолков: " + flat.height + " м\n" + "Студия - " + flat.isStudioApartment);
    }
}
