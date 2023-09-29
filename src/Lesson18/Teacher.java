package Lesson18;
public class Teacher {
    public String name;
    public int age;
    public String subject;
    public String school;
    public int yearsOfExperience;

    // Конструктор класса
    public Teacher(String name, int age, String subject, String school, int yearsOfExperience) {
        this.name = name;
        this.age = age;
        this.subject = subject;
        this.school = school;
        this.yearsOfExperience = yearsOfExperience;
    }

    public static void main(String[] args) {
        // Создаем объект класса Teacher
        Teacher teacher = new Teacher("Профессор Смирнов", 45, "Математика", "Школа №5", 20);

        // Выводим информацию о преподавателе
        System.out.println("Имя: " + teacher.name);
        System.out.println("Возраст: " + teacher.age);
        System.out.println("Предмет: " + teacher.subject);
        System.out.println("Школа: " + teacher.school);
        System.out.println("Стаж работы (лет): " + teacher.yearsOfExperience);

    }
}
