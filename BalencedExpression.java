import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BalencedExpression {
    private final List<Character> leftBrackets = Arrays.asList('(', '{', '[', '<');
    private final List<Character> rightBrackets = Arrays.asList(')', '}', ']', '>');

    public boolean isBalenced(String expression){
        // word is (1 + 1)
        Stack<Character> stack = new Stack<>();
        //Beacuse of this logic the stack will be empty if the string is balenced GENIUS
        for(char c : expression.toCharArray()){
            if(isLeftExpression(c))
            stack.add(c);

            if(isRightExpression(c)){
                if(stack.isEmpty()) return false;
                var top = stack.pop();
                if(!(bracketsMatch(c, top))) return false;
            }
        }
        return stack.isEmpty();
    }

    private boolean isLeftExpression(char ch){
        return leftBrackets.contains(ch);
    }

    private boolean isRightExpression(char ch){
        return rightBrackets.contains(ch);
    }

    private boolean bracketsMatch(char ch, char top){
        return leftBrackets.indexOf(ch) == rightBrackets.indexOf(top);
    }

}
