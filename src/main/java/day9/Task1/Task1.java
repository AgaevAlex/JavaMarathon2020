package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Alex", "3910");
        Teacher teacher = new Teacher("Elena", "Java");
        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());
        student.printInfo();
        teacher.printInfo();


    }
}
