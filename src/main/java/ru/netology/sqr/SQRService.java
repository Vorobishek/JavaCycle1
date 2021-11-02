package ru.netology.sqr;

public class SQRService {

    // int number = new int [90];
    public long findNumbers(int rangeStart, int rangeEnd) {
        int quantity = 0;
        for (int number = 10; number < 99; number++) {
            if (number * number > rangeStart && rangeEnd > number * number) {
                quantity = quantity + 1;
            }

        }
        System.out.println(quantity);
        return quantity;
    }
}
