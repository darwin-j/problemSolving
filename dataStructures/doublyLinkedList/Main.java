package dataStructures.doublyLinkedList;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        DLL doublyLL = new DLL();

        doublyLL.insertAtFirst(9);
        doublyLL.insertAtFirst(6);
        doublyLL.insertAtFirst(8);
        doublyLL.insertAtLast(10);

        doublyLL.display();

    }
}