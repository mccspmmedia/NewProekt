package Lesson18;
public class Doctor {
    public String name;
    public int age;
    public String specialization;
    public String hospital;
    public double yearsOfExperience;

    // Конструктор класса
    public Doctor(String name, int age, String specialization, String hospital, double yearsOfExperience) {
        this.name = name;
        this.age = age;
        this.specialization = specialization;
        this.hospital = hospital;
        this.yearsOfExperience = yearsOfExperience;
    }

    public static void main(String[] args) {
        // Создаем объект класса Doctor
        Doctor doctor = new Doctor("Доктор Иванов", 35, "Кардиолог", "Городская больница №1", 10.5);

        // Выводим информацию о докторе
        System.out.println("Имя: " + doctor.name);
        System.out.println("Возраст: " + doctor.age);
        System.out.println("Специализация: " + doctor.specialization);
        System.out.println("Больница: " + doctor.hospital);
        System.out.println("Стаж работы (годы): " + doctor.yearsOfExperience);
    }
}

