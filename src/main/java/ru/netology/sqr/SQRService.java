package ru.netology.sqr;

public class SQRService {

    // int number = new int [90];
    public int findNumbers(int rangeStart, int rangeEnd) {
        int quantity = 0;
        int squareNumber = 0;
        for (int number = 10; number < 99; number++) {
            squareNumber = number * number;
            if (squareNumber >= rangeStart && rangeEnd >= squareNumber) {
                quantity = quantity + 1;
            }

        }
        System.out.println(quantity);
        return quantity;
    }
}
