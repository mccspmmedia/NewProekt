package Lesson18;
import java.util.Arrays;

public class RuberArray2 {
    private int[] array;
    private int size;

    public RuberArray2() {
        array = new int[10]; // начальная емкость массива
        size = 0;
    }

    public RuberArray2(int[] initialValues) {
        array = Arrays.copyOf(initialValues, initialValues.length);
        size = initialValues.length;
    }

    public void add(int value) {
        ensureCapacity();
        array[size] = value;
        size++;
    }

    public void addAll(int... values) {
        ensureCapacity(size + values.length);
        for (int value : values) {
            array[size] = value;
            size++;
        }
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс вне допустимых границ");
        }
        return array[index];
    }

    public void set(int index, int value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс вне допустимых границ");
        }
        array[index] = value;
    }

    public boolean contains(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1; // если элемент не найден
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс вне допустимых границ");
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    public void removeValue(int value) {
        int index = indexOf(value);
        if (index != -1) {
            remove(index);
        }
    }

    public int size() {
        return size;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private void ensureCapacity() {
        if (size == array.length) {
            int newCapacity = array.length * 2; // увеличиваем емкость вдвое
            array = Arrays.copyOf(array, newCapacity);
        }
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity > array.length) {
            int newCapacity = Math.max(array.length * 2, minCapacity);
            array = Arrays.copyOf(array, newCapacity);
        }
    }

    public static void main(String[] args) {
        RubberArray rubberArray = new RubberArray();
        rubberArray.add(10);
        rubberArray.add(20);
        rubberArray.addAll(30, 40, 50);

        System.out.println("Все значения в массиве:");
        rubberArray.print();

        System.out.println("Индекс элемента со значением 20: " + rubberArray.indexOf(20));
        System.out.println("Элемент по индексу 3: " + rubberArray.get(3));

        rubberArray.set(1, 25);
        System.out.println("Измененное значение по индексу 1: " + rubberArray.get(1));

        System.out.println("Массив содержит значение 30: " + rubberArray.contains(30));

        rubberArray.remove(0);
        System.out.println("После удаления первого элемента:");
        rubberArray.print();

        rubberArray.removeValue(40);
        System.out.println("После удаления элемента со значением 40:");
        rubberArray.print();

        System.out.println("Текущее количество элементов в массиве: " + rubberArray.size());

        int[] initialValues = {100, 200, 300};
        RubberArray newArray = new RubberArray(initialValues);
        System.out.println("Новый массив, созданный из обычного массива:");
        newArray.print();

        newArray.set(0, 150);
        System.out.println("Измененное значение по индексу 0 в новом массиве: " + newArray.get(0));
    }
}
