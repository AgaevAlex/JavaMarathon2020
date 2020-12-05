package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Toyota");
        car.setDate(2004);
        car.setColor("Red");
        System.out.println("Модель машины: " + car.getModel() + ". Цвет машины: " + car.getColor() + ". Год выпуска: " + car.getDate());
    }
}

class Car {
    private String color, model;
    private int date;

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
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
