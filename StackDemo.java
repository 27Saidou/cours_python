import java.util.*;
import java.io.*;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack2 = new Stack<String>();

        // pushing the elements

        stack2.push("java");
        stack2.push("python");
        stack2.push("c++");
        stack2.push("php");
        stack2.push("JS");

        // afficher stack
        System.out.println(stack2);

        // remove stack elements
        stack2.pop();
        System.out.println(stack2);

    }
}
