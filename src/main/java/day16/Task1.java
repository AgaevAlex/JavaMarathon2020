package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("test");
        printResult(file);
    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            int result = 0;
            double finalResult;

            int count = 0;
            while (scanner.hasNextInt()) {
                result += scanner.nextInt();
                count++;
            }
            finalResult = result / count;
            System.out.print(finalResult + " --> " + String.format("%.3f", (finalResult)));
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }
}

