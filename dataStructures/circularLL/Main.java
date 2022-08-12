package dataStructures.circularLL;

public class Main {
    public static void main(String[] arg) {
        CLL circularLL = new CLL();
        circularLL.insertAtFirst(3);
        circularLL.insertAtFirst(7);
        circularLL.insertAtFirst(5);
        circularLL.insertAtLast(10);
        circularLL.display();
    }
}
