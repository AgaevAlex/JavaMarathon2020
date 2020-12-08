package day9.Task2;

public class Rectangle extends Figure {
    private int lenght, weight;

    public Rectangle(int lenght, int weight, String color) {
        super(color);
        this.lenght = lenght;
        this.weight = weight;
    }

    @Override
    public double area() {
        return lenght * weight;
    }

    @Override
    public double perimeter() {
        return 2 * (lenght + weight);
    }
}
