// Linked List class                        ADD ELEMENT IN LAST 
class LL {
    // Node class (inner class)
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

    // Add node at last
    public void addAtLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;  // first element
        } else {
            tail.next = newNode;    // link old tail to new node
            tail = newNode;         // move tail
        }
    }

   
    }


// Main class
public class LinkedList1 {
    public static void main(String[] args) {
        LL list = new LL();
        list.addAtLast("rajh");
        list.addAtLast("rawal");
        list.addAtLast("java");

        
    }
}
