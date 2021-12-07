class CircularLinkedList {  
    //Node definition for circular linked list  
    public class Node{  
        int data;  
        Node next;  
        public Node(int data) {  
            this.data = data;  
        }  
    }    
    //Initially head and tail pointers point to null  
    public Node head = null;  
    public Node tail = null;  
    //add new node to the circular linked list   
    public void add(int data){  
        //Create new node  
        Node newNode = new Node(data);  
        //check if list is empty  
        if(head == null) {  
             //head and tail point to same node if list is empty  
            head = newNode;  
            tail = newNode;  
            newNode.next = head;  
        }  
        else {  
            //tail points to new node if list is not empty
            tail.next = newNode;  
            //New node becomes new tail.  
            tail = newNode;  
            //tail points back to head  
            tail.next = head;  
        }  
    }  
    //Display the nodes in circular linked list 
    public void displayList() {  
        Node current = head;  
        if(head == null) {  
            System.out.println("The List is empty");  
        }  
        else {  
            System.out.println("Circular linked list nodes: ");  
             do{  
                //Print each node of the linked list  
                System.out.print(current.data + " ");  
                current = current.next;  
            }while(current != head);  
            System.out.println();  
        }  
    }  
}