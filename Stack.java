public class Stack {

    private int[] stack = new int[5];
    private int size = 0;

   public void push(int value){
        if(isFull())
        increaseSize();

        stack[size++] = value;
   }

    public int pop(){
        if(isEmpty())
        throw new IllegalStateException("Stack is empty");
    
        return stack[--size];
    }

    public int peak(){
        if(isEmpty())
        throw new IllegalStateException("Stack is empty");

        return stack[size-1];
    }
   
    public boolean isEmpty(){
        return size == 0;
    }
   
    private boolean isFull(){
        return stack.length == size;
    }

    private void increaseSize(){
        int[] newStack = new int[stack.length*2];
        
        for(int i: stack)
        newStack[i] = stack[i];

        stack = newStack;
    }
}
