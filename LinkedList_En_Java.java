import java.util.List;
import java.util.LinkedList;
public class LinkedList_En_Java {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("List: " + list);

        // Access element from the list
        int number = list.get(2);
        System.out.println("Accessed Element: " + number);

        // 
        int index = list.indexOf(2);
        System.out.println("Position of 3 is " + index);

        // Remove element from the list
        int removedNumber = list.remove(1);
        System.out.println("Removed Element: " + removedNumber);
    }
}
