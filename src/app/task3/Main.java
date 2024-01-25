package app.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        doPayment(getBalans(), getPriceFromUser());
    }


    public static double getPriceFromUser() {
        System.out.println("Ведіть суму до оплати:");
        String inputText = new Scanner(System.in).next();
        try {
            return Double.parseDouble(inputText);
        } catch (NumberFormatException e) {
            System.out.println("Введено неправильний формат числа для знятя коштів" + e);
        }
        return 0;
    }

    public static void doPayment(double balans, double price) {
        try {
            if (price > balans) {
                throw new ValidationException("недостатньо коштів на балансі");
            } else if (price < 0) {
                throw new ValidationException("ціна неможе бути відємна");
            } else if (price == 0) {
                System.out.println("Зняття коштів невідбулось");
            } else {
                balans = balans - price;
                System.out.println("Зняття коштів відбулось успішно\n" +
                        "Залишок на рахунку: " + balans);
            }
        } catch (ValidationException e) {
            System.out.println("Помилка при здійснені оплати: " + e);
        }
    }

    public static double getBalans() {
        return 1000;
    }
}
