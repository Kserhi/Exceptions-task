package app.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getPriceOfDay(getData(), getDayFromUser());
    }

    public static int getDayFromUser() {
        System.out.println("Ведіть номер дня (1-5) для якого цікавить ціна:");
        String inputText = new Scanner(System.in).next();
        return Integer.parseInt(inputText);

    }

    public static void getPriceOfDay(double[] productPrice, int namberOfDay) {
        try {
            double price = productPrice[namberOfDay - 1];
            System.out.println("Ціна товару в день " + namberOfDay
                    + " становить " + price);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Номер дня невідповідає очікуваному " + e);
        }
    }

    public static double[] getData() {
        return new double[]{1.2, 33, 4.2, 4, 5.1};
    }
}
