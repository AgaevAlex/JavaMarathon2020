package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 2011, 11111, 10000);
        airplane.fillUp(1444);
        airplane.info();
        Airplane airplane2 = new Airplane("Ил-96", 1996, 44444, 12331);
        airplane2.setYear(2000);
        airplane2.setLenght(33333);
        airplane2.fillUp(2333);
        airplane2.fillUp(3333);
        airplane2.info();

    }
}
