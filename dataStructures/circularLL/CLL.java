package dataStructures.circularLL;

public class CLL {

    private Node head;
    private Node tail;

    public void insertAtFirst(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    public void insertAtLast(int val) {
        Node node = new Node(val);
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public Node find(int val){
Node tempNode = head;
        do{
            
        }while();
    }

    public void delete(int val) {

    }

    public void display() {
        Node tempNode = head;
        if (head != null) {

            do {
                System.out.print(tempNode.val + " -> ");
                tempNode = tempNode.next;
            } while (tempNode != head);

            System.out.print("End");
        }
    }

    private class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}

