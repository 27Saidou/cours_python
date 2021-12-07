class CircularLinkedList {  
    public class Node{  
        int data;  
        Node next;  
        public Node(int data) {  
            this.data = data;  
        }  
    }    

    public Node head = null;  
    public Node tail = null;  
    public void add(int data){  
        Node newNode = new Node(data);  
        if(head == null) {    
            head = newNode;  
            tail = newNode;  
            newNode.next = head;  
        }  
        else {  
            tail.next = newNode;  
            tail = newNode;  
            tail.next = head;  
        }  
    }  
    public void displayList() {  
        Node current = head;  
        if(head == null) {  
            System.out.println("The List is empty");  
        }  
        else {  
            System.out.println("Circular linked list nodes: ");  
            do{  
                //affichage donnee  
                System.out.print(current.data + " ");  
                current = current.next;  
            }while(current != head);  
            System.out.println();  
        }  
    }  
}
