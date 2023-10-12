package Lesson25Task2Optional;
public class Computer {
    private Processor processor;
    private Memory memory;
    private Storage storage;

    public Computer(Processor processor, Memory memory, Storage storage) {
        this.processor = processor;
        this.memory = memory;
        this.storage = storage;
    }

    public String getProcessorBrand() {
        return processor.getBrand();
    }

    public String getProcessorModel() {
        return processor.getModel();
    }

    public String getMemoryBrand() {
        return memory.getBrand();
    }

    public String getMemoryModel() {
        return memory.getModel();
    }

    public String getStorageBrand() {
        return storage.getBrand();
    }

    public String getStorageModel() {
        return storage.getModel();
    }
}
