public class LinkList3 {
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

    public void addAtLast(String data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
    }

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

    // ✅ keep main here
    public static void main(String[] args) {
        LinkList3 list = new LinkList3();

        list.addAtLast("rajh");
        list.addAtLast("rawal");
        list.addAtLast("java");

        list.printlist();
    }
}
