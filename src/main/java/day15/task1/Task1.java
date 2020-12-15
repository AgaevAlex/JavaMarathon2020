package day15.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("src/main/resources/shoes.csv");
        File file2 = new File("shoestxt");
        createTxtFile(file2, parseCsvFileToList(file1));
    }

    public static List<String> parseCsvFileToList(File file) {
        List<String> results = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] result = line.split(";");
                if (Integer.parseInt(result[2]) == 0) {
                    results.add(line);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        return results;
    }

    public static void createTxtFile(File file, List<String> converted) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(file);
        for (String list : converted) {
            pw.println(list.replace(";", " ,"));
        }
        pw.close();
    }
}
