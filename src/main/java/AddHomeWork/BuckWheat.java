package AddHomeWork;

import java.util.Scanner;

public class BuckWheat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;

        System.out.println("Сколько месяцев хотите питаться гречей? Введите число");
        input = scanner.nextInt();

        int pricePerMonthOneKg = 100;
        int basilEatPerMonth = 6;
        int basilWantToEat = input * basilEatPerMonth;
        int sumAllBuckWheat = 0;

        for (int i = 0; i <= basilWantToEat; i+=6) {
            sumAllBuckWheat += i;
        }

        System.out.println(sumAllBuckWheat * pricePerMonthOneKg + " деревянных нужно за " + input + " месяцев");
    }
}
