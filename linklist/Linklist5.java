public class Linklist5 {
    class Node{
        int data;
        Node next;
       

        Node(int data){
            this.data = data;
            this.next = null;





        }
    }
    private Node head;
    private Node tail;
     boolean flag = false;
    public void addlinklistinbetween( int data){
        Node newnode = new Node(data);
        if(head == null){
            System.out.println("list is empty");
            head = tail = newnode;}
            else{
            head.next =newnode;
            newnode=head;
            }
           
        

        

    }



    public class link{
        public static void main(String [] args){
            Linklist5 n  = new Linklist5();
          n.addlinklistinbetween(8);
          
          n.addlinklistinbetween(4);
        }
    }
    
}
