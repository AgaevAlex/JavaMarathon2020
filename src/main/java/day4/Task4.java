package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        final int CONST = 50;
        int[] results = new int[100000];
        int sum = 0, sum2 = 0, index = 0, count = 0;
        Random random = new Random();
        for (int i = 0; i < results.length; i++) {
            results[i] = random.nextInt(10);
        }
        while (count < (results.length % CONST == 0 ? results.length - CONST : results.length - CONST + 1)) {
            for (int y = 0; y < CONST; y++) {
                sum += results[count++];
            }
            if (sum > sum2) {
                index = count;
                sum2 = sum;
            }
            count -= CONST - 1;
            sum = 0;
        }
        System.out.println(sum2);
        System.out.println(index - CONST);
    }
}
