package dataStructures.Stack;

public class MyStack {

    private int[] data;

    private static final int DEFAULT_SIZE = 10;

    private int ptr = -1;

    public MyStack() {
        this(DEFAULT_SIZE);
    }

    public MyStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        // System.out.println(++ptr);
        if (isFull()) {
            data[++ptr] = item;
            return true;
        }

        System.out.println("Stack is full");
        return false;

    }

    public boolean isFull() {

        if (ptr < data.length) {
            return false;
        }

        return true;
    }

    public void display() {
        for (int item : data) {
            System.out.print(item + " ");
        }
    }
}
