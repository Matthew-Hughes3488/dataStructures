package main;
public class ArrayQueue {
    private int front = 0;
    private int end = 0;
    private int[] queue;
    private int count = 0;
    private int queueSize;

    public ArrayQueue(int size){
        queue = new int[size];
        queueSize = size;
    }

    public void enqueue(int value){
        if(isFull())
            throw new IllegalStateException("Array is full");

        count++;
        queue[end] = value;
        end = (end+1) % queueSize;
    }

    public int dequeue(int value){
        if(isEmpty())
            throw new IllegalStateException("Array is empty");
        
        var item = queue[front];
        queue[front] = 0;
        front = (front + 1) % queueSize;
        return item;
    }

    public int peek(){
        if(isEmpty())
            throw new IllegalStateException("Array is empty");
        
        return queue[front];
    }

    public boolean isEmpty(){
        return count == 0;
    }

    private boolean isFull(){
        return count == queueSize;
    }
}
