package day5;


public class Task2 {
    public static void main(String[] args) {
        Motobike motobike = new Motobike("Blue", "Yamaha", 2020);
        System.out.println("Модель байка: " + motobike.getModel() + ". Цвет байка: " + motobike.getColor() + ". Год выпуска: " + motobike.getData());
    }
}

class Motobike {
    private String color, model;
    int data;

    public Motobike(String color, String model, int data) {
        this.color = color;
        this.model = model;
        this.data = data;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getData() {
        return data;
    }
}
