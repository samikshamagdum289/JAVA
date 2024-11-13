import java.util.*;

class CollectionStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        java.util.Stack<Integer> stack = new java.util.Stack<>(); 
        
        while (true) {
            System.out.println("\nStack Operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter the element to push: ");
                    int element = scanner.nextInt();
                    stack.push(element);
                    System.out.println("Element " + element + " pushed to stack.");
                    break;
                    
                case 2:
                    if (!stack.isEmpty()) {
                        int poppedElement = stack.pop();
                        System.out.println("Popped element: " + poppedElement);
                    } else {
                        System.out.println("Stack is empty. Cannot pop.");
                    }
                    break;
                    
                case 3:
                    if (!stack.isEmpty()) {
                        int topElement = stack.peek();
                        System.out.println("Top element: " + topElement);
                    } else {
                        System.out.println("Stack is empty.");
                    }
                    break;
                    
                case 4:
                    if (!stack.isEmpty()) {
                        System.out.println("Stack elements: " + stack);
                    } else {
                        System.out.println("Stack is empty.");
                    }
                    break;
                    
                case 5:
                    System.out.println("Exit");
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
