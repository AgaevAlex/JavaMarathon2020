package day4;

import java.util.Random;


public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int sum = 0, sum2 = 0, index = 0;
        int[][] results = new int[8][12];
        for (int i = 0; i < results.length; i++) {
            for (int y = 0; y < results[i].length; y++) {
                results[i][y] = random.nextInt(50);
                sum += results[i][y];
            }
            if (sum > sum2) {
                index = i;
                sum2 = sum;
            }
            sum = 0;

        }
        System.out.println(index);
    }
}
