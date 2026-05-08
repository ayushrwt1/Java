
class Stack {

    private int stack[];
    private int top;
    Object lock;

    public Stack(int capacity) {
        stack = new int[capacity];
        top = -1;
        lock = new Object();
    }

    public boolean push(int value) {
        synchronized (lock) {
            if (isFull()) {
                System.out.println("Stack is full");
                return false;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            stack[++top] = value;
            return true;
        }

    }

    public int pop() {
        synchronized (lock) {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return stack[top--];
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stack.length - 1;
    }

}

public class Synchronization {

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                stack.push(i);
                System.out.println("Pushed: " + i);
            }
        }, "Pusher").start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                int value = stack.pop();
                System.out.println("Popped: " + value);

            }
        }, "Popper").start();

    }
}
