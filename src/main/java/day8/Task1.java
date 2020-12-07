package day8;

public class Task1 {
    public static void main(String[] args) {
//        StringBuilder string = new StringBuilder();
        long start = System.currentTimeMillis();
        String string = "";
        for (int count = 0; count <= 20000; count++) {
            string += count + " ";
        }
//        for (int count = 0; count <= 20000; count++) {
//            string.append(count + " ");
//        }
        System.out.println(string);
        long finish = System.currentTimeMillis();
        long timeConsumedMillis = finish - start;
        System.out.println(timeConsumedMillis);
    }
}
