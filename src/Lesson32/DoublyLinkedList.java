package Lesson32;
// Класс DoublyLinkedList, реализующий интерфейсы
public class DoublyLinkedList<T> implements BasicDoublyLinkedList<T>, ExtendedDoublyLinkedList<T> {
    private Node<T> first;
    private Node<T> last;
    private int size;

    // Реализация методов интерфейса BasicDoublyLinkedList
    @Override
    public void add(T value) {
        // Ваша реализация добавления элемента в конец списка
    }

    @Override
    public void add(int index, T value) {
        // Ваша реализация добавления элемента в указанную позицию
    }

    @Override
    public T remove(int index) {
        // Ваша реализация удаления элемента из указанной позиции
    }

    @Override
    public T get(int index) {
        // Ваша реализация получения элемента из указанной позиции
    }

    @Override
    public int size() {
        // Ваша реализация получения количества элементов в списке
    }

    @Override
    public boolean isEmpty() {
        // Ваша реализация проверки, пуст ли список
    }

    @Override
    public void clear() {
        // Ваша реализация очистки списка
    }

    // Реализация методов интерфейса ExtendedDoublyLinkedList (которые являются дополнительными)
    @Override
    public void addLast(T value) {
        // Ваша реализация добавления элемента в конец списка (из ExtendedDoublyLinkedList)
    }

    @Override
    public void addFirst(T value) {
        // Ваша реализация добавления элемента в начало списка (из ExtendedDoublyLinkedList)
    }

    @Override
    public T getFirst() {
        // Ваша реализация получения первого элемента (из ExtendedDoublyLinkedList)
    }

    @Override
    public T getLast() {
        // Ваша реализация получения последнего элемента (из ExtendedDoublyLinkedList)
    }

    @Override
    public T remove() {
        // Ваша реализация удаления первого элемента (из ExtendedDoublyLinkedList)
    }

    @Override
    public T removeFirst() {
        // Ваша реализация удаления первого элемента (из ExtendedDoublyLinkedList)
    }

    @Override
    public T removeLast() {
        // Ваша реализация удаления последнего элемента (из ExtendedDoublyLinkedList)
    }
}