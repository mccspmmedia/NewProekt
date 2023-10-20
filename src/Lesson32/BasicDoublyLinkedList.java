package Lesson32;
// Интерфейс BasicDoublyLinkedList
public interface BasicDoublyLinkedList<T> {
    void add(T value);
    void add(int index, T value);
    T remove(int index);
    T get(int index);
    int size();
    boolean isEmpty();
    void clear();
}

