import java.util.*;
import java.util.Stack;
class StackOp 
{
    public static void main(String[] args) 
    {
        Stack stk  = new Stack();
        Stack<Integer> st = new Stack<Integer>();
        for (int i = 0 ; i<5 ; i++)
        st.add(i);
        System.out.println("Element at Top");
        Integer a =(Integer)st.peek();
        System.out.println(a);
        Integer b =(Integer)st.pop();
        System.out.println("Element popped " +b);
        Integer pos = (Integer) st.search(3);
        if(pos==-1)
        System.out.println("Element not found");
        else
        System.out.println("Element found at "+(pos+1));
    }
}

O/P:
Element at Top
4
Element popped 4
Element found at 2
