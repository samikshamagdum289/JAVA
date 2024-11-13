interface Stack {
    void push(int element);
    int pop();
    void display();
    boolean overflow();
    boolean underflow();
}

class integerstack implements Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public integerstack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
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
        return top == maxSize - 1;
    }

    @Override
    public boolean underflow() {
        return top == -1;
    }
}

public class integerstackdemo {
    public static void main(String[] args) {
        integerstack myStack = new integerstack(5);

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);

        
        myStack.push(60);

        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();

       
        myStack.pop();
    }
}
