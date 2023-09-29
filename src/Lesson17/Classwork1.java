package Lesson17;
public class Classwork1 {
    private String name;
    private int age;
    private String studentId;
    private String major;

    public Classwork1(String name, int age, String studentId, String major) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.major = major;
    }

    public void attendClass() {
        System.out.println(name + " is attending class.");
    }

    public void study() {
        System.out.println(name + " is studying.");
    }

    public void submitAssignment() {
        System.out.println(name + " is submitting an assignment.");
    }
}

