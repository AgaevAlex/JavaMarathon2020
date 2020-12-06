package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Крапивин", "Информатика");
        Student student = new Student("Агаев");
        teacher.evaluate(student);
    }
}
