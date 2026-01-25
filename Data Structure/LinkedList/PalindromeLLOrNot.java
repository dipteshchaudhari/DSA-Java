public class PalindromeLLOrNot {

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
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data) {
        
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
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
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; 
    }
    public boolean palindromeOrNot() {


        if(head == null || head.next == null) {
            return true;
        }
        // step 1: find mid
        Node miNode = findMid(head);

        // step 2: reverse 2nd half
        Node prev = null;
        Node curr = miNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;

        // step 3: check left & right half 

        while (right != null) {
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    
    public static void main(String[] args) {

        PalindromeLLOrNot ll = new PalindromeLLOrNot();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(2);
        // ll.addFirst(1);

        ll.printList();  // 1->2->3->4->5

        System.out.println(ll.palindromeOrNot());
        
    }   
}
