package day6;

import java.util.Random;

public class Teacher {
    private String name, subject;
    Random random = new Random();

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(Student student) {
        int count = random.nextInt(4) + 2;
        String appraisal = "";
        switch (count) {
            case 2:
                appraisal = "неудовлетворительно";
                break;
            case 3:
                appraisal = "удовлетворительно";
                break;
            case 4:
                appraisal = "хорошо";
                break;
            case 5:
                appraisal = "отлично";
                break;

        }
        System.out.println("Преподаватель " + name + " оценил студента " + student.getName() + " по предмету " + subject + " на оценку " + appraisal);
    }

}
