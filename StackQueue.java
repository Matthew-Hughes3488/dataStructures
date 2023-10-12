package main;
import java.util.Stack;

public class StackQueue {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    //enqueue
    //dequeue
    //peek
    //isEmpty

    public void enqueue(int value){
        stack1.push(value);
    }

    public int dequeue(){
        if(isEmpty())
            throw new IllegalStateException("Queue is empty");
        
        if(stack2.isEmpty())
            fillStack2();

        return stack2.pop();
    }

    public int peek(){
        if(isEmpty())
            throw new IllegalStateException("Queue is empty");
        
        if(stack2.isEmpty())
            fillStack2();
        
        return stack2.peek();
    }
    
    private void fillStack2(){
        while(!stack1.isEmpty())
        stack2.push(stack1.pop());
    }
    public boolean isEmpty(){
        return (stack1.isEmpty() && stack2.isEmpty());  
    }

}
