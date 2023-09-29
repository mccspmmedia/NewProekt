public class Student {
    public String name;
    public int age;
    public String faculty;
    public int course;
    public double averageGrade;

    // Конструктор класса
    public Student(String name, int age, String faculty, int course, double averageGrade) {
        this.name = name;
        this.age = age;
        this.faculty = faculty;
        this.course = course;
        this.averageGrade = averageGrade;
    }

    public static void main(String[] args) {
        // Создаем объект класса Student
        Student student = new Student("Иванов", 20, "Информатика", 2, 4.0);

        // Выводим информацию о студенте
        System.out.println("Имя: " + student.name);
        System.out.println("Возраст: " + student.age);
        System.out.println("Факультет: " + student.faculty);
        System.out.println("Курс: " + student.course);
        System.out.println("Средний балл: " + student.averageGrade);
    }
}
