public class LinkedList{
    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null; 
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data) {

        //step1: create a new Node 
        Node newNode = new Node(data);

        if(head == null) {
            head = tail = newNode;
            return;
        }
        //step2: newNode's next = head
        newNode.next = head;

        //step3: head = newNode
        head = newNode;

    }
    public void addLast(int data) {
        
        //step1: Create a newNode
        Node newNode = new Node(data);

        if(head == null) {
            head = tail = newNode;
            return;
        }
        //step2 
        tail.next = newNode;

        //step3
        tail = newNode;
    }
    public void printList() {
        
        if(head == null) {
            System.out.println("Linked List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.head = new Node(1);
        // ll.head.next = new Node(2);

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4); 
        ll.printList();
    }
}