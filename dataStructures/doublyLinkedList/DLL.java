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

    public Node find(int val) {
        Node tempNode = head;
        while (tempNode != null) {
            if (tempNode.val == val) {
                return tempNode;
            }

            tempNode = tempNode.next;
        }
        System.out.println(val + " not found");
        return null;
    }

    public void insertAfter(int after, int val) {
        Node prevNode = find(after);
        if (prevNode == null) {
            return;
        }

        Node node = new Node(val);

        node.prev = prevNode;
        if (prevNode.next != null) {
            node.next = prevNode.next;
            prevNode.next.prev = node;
        }
        prevNode.next = node;

    }

    public void delete(int val) {

        Node nodeToBeDeleted = find(val);

        if (nodeToBeDeleted.prev == null) {
            head = nodeToBeDeleted.next;
            nodeToBeDeleted.next.prev = null;
        } else if (nodeToBeDeleted.next == null) {
            nodeToBeDeleted.prev.next = null;
        } else {
            nodeToBeDeleted.prev.next = nodeToBeDeleted.next;
            nodeToBeDeleted.next.prev = nodeToBeDeleted.prev;
        }

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
