public class RemoveCycle{
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
    public static void removeCycle() {
        Node slow = head;
        Node fast = head;

        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                cycle = true;
                break;
            }
        }
        if(cycle == false) {
            return;
        }

        // finding meeting points
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // removing cycle 
        prev.next = null;
    }
    public static boolean hasCycle(Node head) {

        Node slow = head;       
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {    

        Node head = new Node(1);
        Node temp = new Node(4);
        head.next = temp;
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = temp;

        System.out.println(hasCycle(head));
        removeCycle();
        System.out.println(hasCycle(head));
    }   
}

