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
    public static int size;

    public void addFirst(int data) {

        //step1: create a new Node 
        Node newNode = new Node(data);
        size++;
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
        size++;

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
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public void add(int idx,int data) {
        
        if(idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;

        int i=0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public int removeFirst() {

        if(size == 0) {
            System.out.println("ll is empty!");
            return Integer.MIN_VALUE;
        }else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;

    }
    public int removeLast() {
        if(size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node temp = head;
        for(int i=0; i<size-2; i++) {
            temp = temp.next;
        }
        int val = temp.next.data; // tail.data  
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }

    public int itrSearch(int key) {
        Node temp = head;

        int idx = 0;
        while (temp != null) {
            
            if(temp.data == key) {
                return idx;
            }
            idx++;
            temp = temp.next;
        }   
        return -1;
    }

    public int helper(Node head,int key) {
        if(head == null) {
            return -1;
        }

        if(head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1) {
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key) {
        return helper(head,key);
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.head = new Node(1);
        // ll.head.next = new Node(2);
    
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        
        ll.add(2, 420); 
        ll.printList();
        System.out.println(ll.size);

        ll.removeFirst();
        ll.printList();

        ll.removeLast();
        ll.printList();
        System.out.println(ll.size);

        System.out.println(ll.itrSearch(42));
        System.out.println(ll.recSearch(420));
        
    }
}