package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] results = new int[10];
        int[] sum = new int[results.length / 3];
        int b = 0, c = 0, finalResult = 0;
        Random random = new Random();
        for (int i = 0; i < results.length; i++) {
            results[i] = random.nextInt(10000);
        }
        for (int i = 0; i < sum.length; i++) {
            sum[i] = results[b++] + results[b++] + results[b++];
        }

        for (int a = 1; a < sum.length; a++) {
            if (sum[c] >= sum[a]) {
                finalResult = c;
            } else {
                finalResult = a;
                c = a;
            }
        }
        System.out.println(finalResult * 3);
    }
}
