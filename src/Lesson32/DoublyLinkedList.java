package Lesson32;

public class DoublyLinkedList<T> implements BasicDoublyLinkedList<T>, ExtendedDoublyLinkedList<T> {
    private Node<T> first;
    private Node<T> last;
    private int size;

    @Override
    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        if (last == null) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            newNode.prev = last;
            last = newNode;
        }
        size++;
    }

    @Override
    public void add(int index, T value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }

        if (index == size) {
            addLast(value);
        } else if (index == 0) {
            addFirst(value);
        } else {
            Node<T> newNode = new Node<>(value);
            Node<T> current = getNode(index);

            newNode.prev = current.prev;
            newNode.next = current;
            current.prev.next = newNode;
            current.prev = newNode;

            size++;
        }
    }

    @Override
    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }

        Node<T> current = getNode(index);
        T removedValue = current.value;

        if (current == first) {
            removeFirst();
        } else if (current == last) {
            removeLast();
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
        }

        return removedValue;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        return getNode(index).value;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        first = null;
        last = null;
        size = 0;
    }

    @Override
    public void addLast(T value) {
        add(value);
    }

    @Override
    public void addFirst(T value) {
        Node<T> newNode = new Node<>(value);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            newNode.next = first;
            first.prev = newNode;
            first = newNode;
        }
        size++;
    }


    @Override
    public T getFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("The list is empty");
        }
        return first.value;
    }

    @Override
    public T getLast() {
        if (isEmpty()) {
            throw new IllegalStateException("The list is empty");
        }
        return last.value;
    }

    @Override
    public T remove() {
        return removeFirst();
    }

    @Override
    public T removeFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("The list is empty");
        }
        T removedValue = first.value;
        first = first.next;
        if (first != null) {
            first.prev = null;
        } else {
            last = null;
        }
        size--;
        return removedValue;
    }

    @Override
    public T removeLast() {
        if (isEmpty()) {
            throw new IllegalStateException("The list is empty");
        }
        T removedValue = last.value;
        last = last.prev;
        if (last != null) {
            last.next = null;
        } else {
            first = null;
        }
        size--;
        return removedValue;
    }

    private Node<T> getNode(int index) {
        Node<T> current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    private static class Node<T> {
        T value;
        Node<T> prev;
        Node<T> next;

        Node(T value) {
            this.value = value;
        }
    }
}
