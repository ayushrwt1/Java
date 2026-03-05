import java.util.*;
public class LearnArrayList {
    public static void main (String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");

        list.add(0, "Insert at index 0");

        String element = list.get(1); // Access element at index 1
        System.out.println(element);

        list.set(2, "Update at index 2"); // Update element at index 2

        list.remove(3); // Remove element at index 3
        System.out.println(list);
    }
}