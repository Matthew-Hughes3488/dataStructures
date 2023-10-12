import java.util.Stack;

public class StringReverser {

    public String reverse(String word) {
        Stack<Character> stack = new Stack<>();
    
        char[] characters = word.toCharArray();
        
        for(char chars : characters){
            stack.add(chars);
        }
    
        for(int i = 0; i < characters.length; i++){
            characters[i] = stack.pop();
        }
    
        return characters.toString();
    }
    
}
