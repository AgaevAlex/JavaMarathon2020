package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        try {
            File file1 = new File("file1.txt");
            File file2 = new File("file2.txt");

            PrintWriter pw1 = new PrintWriter(file1);
            PrintWriter pw2 = new PrintWriter(file2);
            Scanner scanner1 = new Scanner(file1);
            Scanner scanner2 = new Scanner(file2);


            generateFile1(pw1);


            averageConter(scanner1, pw2);
            printResult(scanner2);

            pw1.close();
            pw2.close();
            scanner1.close();
            scanner2.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }

    public static void generateFile1(PrintWriter pw) throws FileNotFoundException {
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            pw.print(random.nextInt(100) + " ");
        }
    }

    public static void averageConter(Scanner scanner, PrintWriter pw) {
        double result = 0;
        while (scanner.hasNextInt()) {
            for (int y = 0; y < 20; y++) {
                result += scanner.nextInt();
            }
            pw.print(result / 20 + " ");
            result = 0;
        }
    }

    public static void printResult(Scanner scanner) {
        double result = 0;
        String line = "";
        String[] arrOfStr = new String[0];

        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            arrOfStr = line.split(" ");
        }
        for (String sum : arrOfStr) {
            result += Double.parseDouble(sum);
        }
        System.out.println((int) result);
    }
}
