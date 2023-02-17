
/**
 * A doubly-linked list of numbers
 */
public class DLList {
    Node head;
    int size;    // total number of nodes in the list
    
    class Node {
        int value;
        Node prev;
        Node next;
        
        public Node(int value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }
    
    /** Construct an empty list. */
    public DLList() {
        this.head = new Node(0, null, null);
        this.head.prev = this.head;
        this.head.next = this.head;
        this.size = 0;
    }
    
    
    /**
     * @return the number of values in the list.
     */
    public int size() {
        return this.size;
    }
    
    
    /** Add newValue to the beginning of this list. */
    public void addFirst(int newValue) {
        Node newNode = new Node(newValue,
                                this.head,
                                this.head.next);
        this.head.next.prev = newNode;
        this.head.next = newNode;
        size++;  // size = size + 1
    }
    
    
    
    public String toString() {
        return "";
    }
    
}
