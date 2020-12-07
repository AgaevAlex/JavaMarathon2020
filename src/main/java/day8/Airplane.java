package day8;

public class Airplane {
    private String producer;
    private int year, lenght, weight, fuel = 0;

    public Airplane(String producer, int year, int lenght, int weight) {
        this.producer = producer;
        this.year = year;
        this.lenght = lenght;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + lenght + ", вес: " + weight + ", количество топлива в баке: " + fuel;
    }

    public void info() {
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + lenght + ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }

    public void fillUp(int fuel) {
        this.fuel += fuel;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }
}
