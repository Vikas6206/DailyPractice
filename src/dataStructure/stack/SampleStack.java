package dataStructure.stack;

import java.util.Stack;

public class SampleStack {
//Last in first out
    public static void main(String args[]){
        Stack<Integer> stack = new Stack();
        stack.push(5);
        stack.push(2);
        stack.push(7);
        stack.push(9);
        stack.push(1);

        System.out.println(stack);

        System.out.println("Removing the top element "+stack.peek());
        stack.pop();
        System.out.println(stack);
    }
}
