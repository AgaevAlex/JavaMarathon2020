package day12;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> brands = new ArrayList<>(Arrays.asList("Audi", "BMW", "Lada", "Tesla", "Toyota"));
        for (String brand : brands) {
            System.out.println(brand);
        }
        brands.add(2, "Lexus");
        brands.remove(0);
        for (String brand : brands) {
            System.out.println(brand);
        }
    }
}
