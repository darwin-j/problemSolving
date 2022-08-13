package dataStructures.Stack;

public class Main {

    public static void main(String[] args) throws Exception {

        // MyStack stack = new MyStack(2);

        // stack.push(3);
        // stack.push(6);

        // stack.display();

        // System.out.println("peek -> " + stack.peek());

        DynamicStack dStack = new DynamicStack(2);
        dStack.push(3);
        dStack.push(2);
        dStack.push(7);
        dStack.display();

    }

}
