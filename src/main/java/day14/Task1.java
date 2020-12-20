package day14;

import org.hibernate.event.spi.SaveOrUpdateEvent;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("test1");
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        int result = 0, count = 0;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextInt()) {
                result += scanner.nextInt();
                count++;
            }
            if (count != 10) {
                throw new IOException();
            }
            System.out.println(result);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
        }
    }
}
