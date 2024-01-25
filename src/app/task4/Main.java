package app.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        doMeasurements(getTemperature());
    }
    public static void doMeasurements(double temperature){
        try {
            if(temperature>35 | temperature<-10){
                throw new CastomException("температура "+temperature+" вийшла за межі " +
                        "діапазону від -10 до 35");
            }else {
                System.out.println("Температура становить: "+temperature+" градусів");
            }

        }catch (CastomException e){
            System.out.println("Помилка вимірювань "+e);
        }
    }
    public static double getTemperature() {
        System.out.println("Введіть температуру повітря:");
        String inputText = new Scanner(System.in).next();
        return Double.parseDouble(inputText);
    }
}
