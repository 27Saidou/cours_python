public class CircularApp {
    public static void main(String[] args) {
        // create a CircularLinkedList object
        CircularLinkedList c_list = new CircularLinkedList();
        // Add data to the list
        c_list.add(10);
        c_list.add(20);
        c_list.add(30);
        c_list.add(40);
        // Display the nodes in circular linked list
        c_list.displayList();
    }
}
