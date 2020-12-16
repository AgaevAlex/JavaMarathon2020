package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        generateFile1(file1);
        averageConter(file1, file2);
        printResult(file2);

    }

    public static void generateFile1(File file) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(file);
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            pw.print(random.nextInt(100) + " ");
        }
        pw.close();
    }

    public static void averageConter(File file1, File file2) {
        try {
            Scanner scanner = new Scanner(file1);
            PrintWriter pw = new PrintWriter(file2);
            double result = 0;
            while (scanner.hasNextInt()) {
                for (int y = 0; y < 20; y++) {
                    result += scanner.nextInt();
                }
                pw.print(result / 20 + " ");
                result = 0;

            }
            scanner.close();
            pw.close();


        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            double result = 0;

            while (scanner.hasNext()) {
                result += Double.parseDouble(scanner.next());
            }
            System.out.println((int) result);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
