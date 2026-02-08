public class Revision {
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {

        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void printL() {

        Node temp = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;            
        }
        System.out.println("NULL");
    }
    public void addAtIndex(int data,int idx) {

        if(idx == 0){
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
            System.out.println("list is empty!");
            return Integer.MIN_VALUE;
        }
        if(size == 1) {
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
            System.out.println("list is already empty!");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        Node temp = head;
        
        for(int i=0; i<size-2; i++) {
            temp = temp.next;
        }
        int val = temp.next.data;
        temp.next = null;
        size--;
        tail = temp;
        return val;

    }
    public int SearchKey(int key){
        Node temp = head;

        int i=0;
        while (temp != null) {    
            if(temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public void reverseLL(){
        Node prev = null;
        Node curr = tail = head ;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;  
    }
    public void removeNthNodeFromEnd(int n) {
        
        int s = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            s++;
        }

        if(n == s) {
            head = head.next;
            return;
        }

        Node prev = head;
        int i = 0;
        while ( i < s - n - 1) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;

    }
    public static void main(String[] args) {
        Revision l1 = new Revision();
        // l1.head = new Node(1);
        // l1.head.next = new Node(2);
        // l1.head.next.next = new Node(3);

        l1.addFirst(1);
        l1.addFirst(0);
        l1.addLast(2);
        l1.printL();
        System.out.println("the size of List:"+size);

        l1.addAtIndex(5, 1);
        l1.printL();
        System.out.println("the size of List:"+size);

        // l1.removeFirst();
        // l1.printL();
        // System.out.println("the size" + size);

        // l1.removeLast();
        // l1.printL();
        // System.out.println("the size" + size);

        // System.out.println(l1.SearchKey(1));

        l1.reverseLL();
        l1.printL();

        l1.removeNthNodeFromEnd(3);
        l1.printL();
    }
}
