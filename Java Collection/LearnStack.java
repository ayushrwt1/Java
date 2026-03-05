import java.util.*;

public class LearnStack{
    public static void main(String[] args){
        Stack<String> stack = new Stack<>();
        stack.push("Hello");
        stack.push("World");
        stack.push("Java");

        String topElement = stack.peek(); // Access the top element
        System.out.println(topElement);

        String poppedElement = stack.pop(); // Remove and return the top element
        System.out.println(poppedElement);

        System.out.println(stack);
    }
} 