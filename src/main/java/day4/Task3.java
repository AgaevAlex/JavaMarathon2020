package day4;

import java.util.Random;


public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int b = 0, sum = 0, finalResult = 0, c = 0;
        int[] counter = new int[8];
        int[][] results = new int[8][12];
        for (int i = 0; i < results.length; i++) {
            for (int y = 0; y < results[i].length; y++) {
                results[i][y] = random.nextInt(50);
                sum += results[i][y];
            }
            counter[b++] = sum;
            sum = 0;
        }

        for (int a = 1; a < counter.length; a++) {
            if (counter[c] >= counter[a]) {
                finalResult = c;
            } else {
                finalResult = a;
                c = a;
            }

        }
        System.out.println(finalResult);
    }
}
