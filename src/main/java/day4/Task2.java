package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] results = new int[100];
        int min, max, count = 0, sum = 0;
        for (int i = 0; i < results.length; i++) {
            results[i] = random.nextInt(10000);
        }
        min = max = results[0];
        for (int result : results) {
            if (result < min) {
                min = result;
            }
            if (result > max) {
                max = result;
            }
            if (result % 10 == 0) {
                count++;
                sum += result;
            }
        }
        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + count);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sum);
    }
}
