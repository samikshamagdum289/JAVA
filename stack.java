import java.util.*;
import java.lang.*;
class Stack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
            System.out.println("Pushed " + value + " to the stack.");
        } else {
            System.out.println("Stack overflow. Cannot push " + value + ".");
        }
    }

    public int pop() {
        if (top >= 0) {
            int poppedValue = stackArray[top--];
            System.out.println("Popped " + poppedValue + " from the stack.");
            return poppedValue;
        } else {
            System.out.println("Stack underflow. Cannot pop from an empty stack.");
            return -1; // Assuming -1 as an indicator of an empty stack
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

class Queue {
    private int maxSize;
    private int front;
    private int rear;
    private int[] queueArray;

    public Queue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
    }

    public void enqueue(int value) {
        if (rear < maxSize - 1) {
            queueArray[++rear] = value;
            System.out.println("Enqueued " + value + " to the queue.");
        } else {
            System.out.println("Queue overflow. Cannot enqueue " + value + ".");
        }
    }

    public int dequeue() {
        if (!isEmpty()) {
            int dequeuedValue = queueArray[front++];
            System.out.println("Dequeued " + dequeuedValue + " from the queue.");
            return dequeuedValue;
        } else {
            System.out.println("Queue underflow. Cannot dequeue from an empty queue.");
            return -1; // Assuming -1 as an indicator of an empty queue
        }
    }

    public boolean isEmpty() {
        return front > rear;
    }
}

public class stack {
    public static void main(String[] args) {
        // Stack operations
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println("Is Stack Empty? " + stack.isEmpty());

        // Queue operations
        Queue queue = new Queue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        System.out.println("Is Queue Empty? " + queue.isEmpty());
    }
}
