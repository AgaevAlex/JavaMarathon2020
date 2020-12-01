package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        if (result >= 1 && result <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (result >= 5 && result <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (result >= 9) {
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Ошибка ввода");
        }
    }
}
