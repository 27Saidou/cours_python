import java.util.*;


public class StackExemple {
    // En Java, les piles sont une structure de données LIFO (Last In, First Out)
    // pour les objets
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        // Use add() method to add elements
        stack.push(10);
        stack.push(15);
        stack.push(30);
        stack.push(80);
        stack.push(5);
        // Displaying the Stack
        System.out.println("Initial Stack: " + stack);
        // Removing elements using pop() method
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        // Displaying the Stack after pop operation
        System.out.println("Stack after pop operation " + stack);
        if (stack.isEmpty()) {
            System.out.println("Empty Stack");
        }
    }
}
