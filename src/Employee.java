
public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void info() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Зарплата: " + salary);
    }

    public static void main(String[] args) {
        // Пример использования класса Employee
        Employee employee = new Employee("Иван Иванов", 30, 50000.0);
        employee.info();
    }
}
