package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car("Yellow", "Tesla", 2018);
        Motorbike motobike = new Motorbike("Green", "BMW", 2014);
        car.info();
        System.out.println("Модель машины: " + car.getModel() + ". Цвет машины: " + car.getColor() + ". Год выпуска: " + car.getDate());
        System.out.println(car.yearDifference(2011));
        motobike.info();
        System.out.println("Модель байка: " + motobike.getModel() + ". Цвет байка: " + motobike.getColor() + ". Год выпуска: " + motobike.getDate());
        System.out.println(motobike.yearDifference(2333));

    }
}
