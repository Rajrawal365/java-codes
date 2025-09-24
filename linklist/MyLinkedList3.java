class MyLinkedList3 {
    private class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;

    // Add node at end
    public void addNodeAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {       // if list is empty
            head = tail = newNode;
        } else {
            tail.next = newNode;  // link last node to new node
            tail = newNode;       // move tail to new node
        }
    }

    // Print the list
    public void printList() {
        if (head == null) {
            System.out.println("Linked List is EMPTY!");
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    // ✅ Main method directly here
    public static void main(String[] args) {
        MyLinkedList3 list = new MyLinkedList3();

        list.addNodeAtEnd(10);
        list.addNodeAtEnd(20);
        list.addNodeAtEnd(30);

        list.printList(); // Output: 10 20 30
    }
}
