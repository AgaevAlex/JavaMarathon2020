package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int count = scanner.nextInt();
        int count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0;
        int[] result = new int[count];
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(10);
            if (result[i] == 1) {
                count2++;
            }
            if (result[i] > 8) {
                count3++;
            }
            if (result[i] % 2 == 0) {
                count4++;
            }
            System.out.print(i + " ");
        }
        System.out.println("Длина массива: " + result.length);
        System.out.println("Количество чисел больше 8: " + count2);
        System.out.println("Количестве чисел равных 1" + count3);
        System.out.println("Коилчество четных чисел: " + count4);
        System.out.println("Коилчество нечетных чисел: " + (result.length - count4));
        System.out.println("Смма всех элементов массива: " + result.length);

    }
}
