package ru.gertru;

public class Task1 {
    public static void main(String[] args) {

        String mask = "**** **** **** ";

        String cardNumber = "1234 5678 9012 3456";
        System.out.println("Номер с пробелами:  " + mask + cardNumber.substring(cardNumber.length() - 4));

        String cardNumber2 = "1234567890123456";
        System.out.println("Номер без пробелов: " + mask + cardNumber2.substring(cardNumber2.length() - 4));

    }
}
