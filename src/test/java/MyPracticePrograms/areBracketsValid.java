package MyPracticePrograms;
import java.util.Stack;

public class areBracketsValid {
    public static void main(String[] args) {
        String Input="()[]{}";

        Stack<Character> stack=new Stack<>();
        for(Character c:Input.toCharArray()){
            if(c=='('||c=='{'||c=='['){
                stack.add(c);
            }else if(c==')' && stack.peek()=='('){
                stack.pop();
            }
            else if(c=='}' && stack.peek()=='{'){
                stack.pop();
            }
            else if(c==']' && stack.peek()=='['){
                stack.pop();
            }
        }

        System.out.println(stack.isEmpty());
    }
}
