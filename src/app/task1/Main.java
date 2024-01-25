package app.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведіть число:");
        String inputText = scanner.next();

        try {
            double namber = Double.parseDouble(inputText);
            System.out.println("Ви ввели число: " + namber);
        } catch (NumberFormatException e) {
            System.out.println("Ведено неправильний формат числа " + e);
        }

    }
}
