package Lesson32;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> myList = new DoublyLinkedList<>();

        myList.add(1);
        myList.add(2);
        myList.add(3);

        System.out.println("List size: " + myList.size());

        System.out.println("First element: " + myList.getFirst());
        System.out.println("Last element: " + myList.getLast());

        System.out.println("Removing first element: " + myList.removeFirst());

        System.out.println("List size: " + myList.size());
        System.out.println("First element: " + myList.getFirst());

        myList.addLast(4);
        myList.addFirst(0);

        System.out.println("List size: " + myList.size());
        System.out.println("First element: " + myList.getFirst());
        System.out.println("Last element: " + myList.getLast());

        System.out.println("Removing last element: " + myList.removeLast());

        System.out.println("List size: " + myList.size());
        System.out.println("Last element: " + myList.getLast());
    }
}

