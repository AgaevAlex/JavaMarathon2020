package day6;

public class Car {
    private String color, model;
    private int date;

    public Car(String color, String model, int date) {
        this.color = color;
        this.model = model;
        this.date = date;
    }

    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int date) {
        return this.date > date ? this.date - date : date - this.date;
    }

    public int getDate() {
        return date;
    }

    public void setYear(int date) {
        this.date = date;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}

