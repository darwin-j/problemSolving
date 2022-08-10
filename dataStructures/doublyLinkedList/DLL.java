package dataStructures.doublyLinkedList;

public class DLL {

    private Node head;

    public void insertAtFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) { // may be list is empty so check if head.prev
            head.prev = node;
        }
        head = node;
    }

    public void insertAtLast(int val) {

        Node node = new Node(val);

        Node tempNode = head;
        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }

        Node last = tempNode;

        last.next = node;
        node.prev = last;
        node.next = null;
        last = node;

    }

    public void display() {

        Node tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.val + " ");
            tempNode = tempNode.next;
        }
    }

    private class Node {
        int val;
        Node prev;
        Node next;

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node prev, Node next) {
            this.val = val;
            this.prev = prev;
            this.next = next;
        }

    }
}
