// Define the Stack interface
interface Stack {
    int MAX_SIZE = 5; // Maximum size of the stack

    void push(int element);

    int pop();

    void display();

    boolean overflow();

    boolean underflow();
}

// Implement the IntegerStack class
class IntegerStack implements Stack {
    private int[] stackArray;
    private int top;

    public IntegerStack() {
        stackArray = new int[MAX_SIZE];
        top = -1;
    }

    @Override
    public void push(int element) {
        if (!overflow()) {
            stackArray[++top] = element;
            System.out.println("Pushed: " + element);
        } else {
            System.out.println("Stack overflow! Cannot push element " + element);
        }
        display();
    }

    @Override
    public int pop() {
        if (!underflow()) {
            int poppedElement = stackArray[top--];
            System.out.println("Popped: " + poppedElement);
            display();
            return poppedElement;
        } else {
            System.out.println("Stack underflow! Cannot pop element.");
            return -1; // Return a default value indicating underflow
        }
    }

    @Override
    public void display() {
        System.out.print("Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }

    @Override
    public boolean overflow() {
        return top == MAX_SIZE - 1;
    }

    @Override
    public boolean underflow() {
        return top == -1;
    }
}

// Create a test class
public class TestStack {
    public static void main(String[] args) {
        IntegerStack myStack = new IntegerStack();

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);

        // Attempting to push more elements than the maximum size
        myStack.push(60);

        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();

        // Attempting to pop from an empty stack
        myStack.pop();
    }
}

