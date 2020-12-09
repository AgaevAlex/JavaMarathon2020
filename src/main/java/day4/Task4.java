package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        final int CONST = 50;
        int[] results = new int[100000];
        int sum = 0, sum2 = 0, index = 0;
        Random random = new Random();
        for (int i = 0; i < results.length; i++) {
            results[i] = random.nextInt(10);
        }

        for (int count = 0; count < results.length - CONST + 1; count++) {
            for (int count2 = 0; count2 < CONST; count2++) {
                sum += results[count + count2];
            }
            if (sum > sum2) {
                sum2 = sum;
                index = count;
            }
            sum = 0;
        }
        System.out.println(sum2);
        System.out.println(index);
    }
}
