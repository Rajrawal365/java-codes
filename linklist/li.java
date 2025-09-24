public class li
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
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
    }

    // Print list
    public void printlist() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currentnode = head;
        while (currentnode != null) {
            System.out.print(currentnode.data + " ");
            currentnode = currentnode.next;
        }
        System.out.println();
    }

    // Main class
    public static class LL {
        public static void main(String[] args) {
            linklist3 list = new linklist3();

            list.addAtLast("rajh");
            list.addAtLast("rawal");
            list.addAtLast("java");

            list.printlist();  // Output: rajh rawal java
        }
    }
}
