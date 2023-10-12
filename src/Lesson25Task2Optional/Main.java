package Lesson25Task2Optional;
public class Main {
    public static void main(String[] args) {
        // Создаем компоненты: процессор, память и накопитель
        Processor processor = new Processor("Intel", "Core i7");
        Memory memory = new Memory("Kingston", "16GB DDR4");
        Storage storage = new Storage("Samsung", "512GB SSD");

        // Создаем компьютер и передаем ему компоненты
        Computer computer = new Computer(processor, memory, storage);

        // Выводим информацию о компьютере и его компонентах
        System.out.println("Computer Information:");
        System.out.println("Processor: " + computer.getProcessorBrand() + " " + computer.getProcessorModel());
        System.out.println("Memory: " + computer.getMemoryBrand() + " " + computer.getMemoryModel());
        System.out.println("Storage: " + computer.getStorageBrand() + " " + computer.getStorageModel());
    }
}
