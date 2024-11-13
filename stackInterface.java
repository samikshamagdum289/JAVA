interface stack { 
    int size = 5;
    void push(int element);
    int pop();
    void display();
    boolean overflow();
    boolean underflow();
    } class integerStack implements stack { 
    int[] arr;
    int top;
    public integerStack() { 
    arr = new int[size];
    top = -1;
    } 
    public boolean overflow() { 
    return top == size-1;
    } public boolean underflow(){ 
    return top == -1;
    } 
    public void push(int element) { 
    if(!overflow()) { 
    arr[++top]= element;
    System.out.println("PUSHED ELEMENT :"+element);
    } else{ 
    System.out.println("Stack overflow !");
    }} 
    public int pop(){ 
    if(!underflow()) { 
    int popElement = arr[top--];
   System.out.println("POPED ELEMENT :"+ popElement);
    return popElement;} 
    else{ 
    System.out.println("Stack underflow !");
    return -1;
    }} 
    public void display(){ 
    System.out.println("Stack : ");
    for(int i=0 ; i<=top ;i++){ 
    System.out.println(arr[i]+" ");} 
    System.out.println();
    }} 
    public class stackInterface { 
    public static void main(String[] args){ 
    integerStack i = new integerStack();
    i.push(10);
    i.push(20);
    i.push(30);
    System.out.println();
    i.display();
    System.out.println();
    i.pop();
    System.out.println();
    i.display();
    i.pop();
    i.pop();
    System.out.println();
    i.display();
    System.out.println();
    i.push(40);
    i.display();
    } } 