public class Employee {
    private static int nextId = 1; // Статическое поле для генерации уникальных идентификаторов
    private int employeeId; // Уникальный идентификатор сотрудника
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.employeeId = nextId++; // Присваиваем уникальный идентификатор и увеличиваем счетчик
    }

    public void info() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Зарплата: " + salary);
        System.out.println("ID сотрудника: " + employeeId);
    }

    public static void main(String[] args) {
        // Пример использования класса Employee
        Employee employee1 = new Employee("Иван Иванов", 30, 50000.0);
        Employee employee2 = new Employee("Петр Петров", 25, 45000.0);

        employee1.info();
        employee2.info();
    }
}
