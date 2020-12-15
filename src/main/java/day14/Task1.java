package day14;

import org.hibernate.event.spi.SaveOrUpdateEvent;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("tes1 t");
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        int result = 0, count = 0;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextInt()) {
                scanner.nextLine();
                count++;
            }
            if (count != 10) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("Некорректный входной файл");
                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
