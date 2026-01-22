public class DeleteFromNthNodeFromEnd {
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
    public void deleteFromN_Node(int n) {

        //calculating the size
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        if(n == size) {
            head = head.next;
            return;
        }

        int i=1;
        Node prev = head;
        while (i < size-n) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }
    
    public static void main(String[] args) {

        DeleteFromNthNodeFromEnd ll = new DeleteFromNthNodeFromEnd();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);

        ll.printList();  // 1->2->3->4->5

        ll.deleteFromN_Node(3);
        ll.printList();
    }
}
