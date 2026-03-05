import java.util.*;
public class LearnLinkedListQueue {
    public static void main (String[] args){
        Queue<String> queue = new LinkedList<>();
        queue.offer("Hello");
        queue.offer("World");
        queue.offer("Java");
        String frontElement = queue.peek(); // Access the front element 
        System.out.println(frontElement);
        String removedElement = queue.poll(); // Remove and return the front element
        System.out.println(removedElement);
        System.out.println(queue);
    }
}