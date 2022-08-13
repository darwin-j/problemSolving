package dataStructures.Stack;

public class MyStack {

    protected int[] data;

    private static final int DEFAULT_SIZE = 10;

    private int ptr = -1;

    public MyStack() {
        this(DEFAULT_SIZE);
    }

    public MyStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {

        if (!isFull()) {
            data[++ptr] = item;
            return true;
        }

        System.out.println("Stack is full");
        return false;

    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is Empty");
        }

        return data[ptr--];

    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is Empty");
        }
        return data[ptr];
    }

    public boolean isFull() {

        return ptr == data.length - 1;
    }

    public boolean isEmpty() {

        return ptr == -1;
    }

    public void display() {
        for (int i = 0; i <= ptr; i++) {
            System.out.print(data[i] + " ");
        }
    }
}
