public class Main {
    public static void main(String[] args) throws Exception {
        Stack stack = new Stack();
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(3);
        stack.push(3);
        stack.push(3);

        System.out.println(stack.pop());       
    }
}
