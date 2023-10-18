package Lesson30;
import java.util.Arrays;
import java.util.Random;

public class RubberArray<T> {
    private T[] array;
    private int cursor;
    static final int MULTIPLIER = 2;
    Random random = new Random();

    public RubberArray() {
        array = (T[]) new Object[10];
    }

    public RubberArray(int sizeDefault) {
        array = (T[]) new Object[sizeDefault];
    }

    public void add(T number) {
        if (cursor == array.length - 1) {
            expandArray();
        }
        array[cursor++] = number;
    }

    public void add(T... values) {
        for (T value : values) {
            add(value);
        }
    }

    private void expandArray() {
        T[] newArray = (T[]) new Object[array.length * MULTIPLIER];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < cursor; i++) {
            result.append(array[i]);
            if (i < cursor - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }

    public int length() {
        return cursor;
    }

    public int indexOf(T number) {
        for (int i = 0; i < cursor; i++) {
            if (array[i].equals(number)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T number) {
        for (int i = cursor - 1; i >= 0; i--) {
            if (array[i].equals(number)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(T value) {
        return indexOf(value) >= 0;
    }

    public boolean remove(T value) {
        int index = indexOf(value);
        removeByIndex(index);
        return index >= 0;
    }

    public T[] toArray() {
        T[] result = Arrays.copyOf(array, cursor);
        return result;
    }

    public void trim() {
        array = toArray();
    }

    public T removeByIndex(int index) {
        if (index < 0 || index >= cursor) {
            return null;
        }
        T value = array[index];
        T[] result = (T[]) new Object[array.length - 1];
        for (int i = 0, j = 0; i < cursor; i++) {
            if (i != index) {
                result[j] = array[i];
                j++;
            }
        }
        cursor--;
        array = result;
        return value;
    }
}
