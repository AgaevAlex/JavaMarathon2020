package day6;


public class Motorbike {
    private String color, model;
    int date;

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int date) {
        return this.date > date ? this.date - date : date - this.date;
    }

    public Motorbike(String color, String model, int data) {
        this.color = color;
        this.model = model;
        this.date = data;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getDate() {
        return date;
    }
}
