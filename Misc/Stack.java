import java.util.EmptyStackException;

public class Stack {

    private int[] stack;
    private int top;

    public Stack(int size) {
        stack = new int[size];
        top = -1;
    }

    public void push(int data) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }

        top++;
        stack[top] = data;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException("Stack is empty");
        }

        int data = stack[top];
        top--;
        return data;
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException("Stack is empty");
        }

        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stack.length - 1;
    }

    public int size() {
        return top + 1;
    }

    public void printStack() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}