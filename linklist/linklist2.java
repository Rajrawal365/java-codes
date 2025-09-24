public class linklist2 {
    
    class Node{
        int data;
        Node next;




        Node(int data){
            this.data = data;
            this.next=  null;


            
        }
    }
    private Node head;
    private Node tail;
    
    public void adddfirst(int data){
        Node newnode = new Node(data);
        if(head == null){
            head =tail=newnode;
            } else{
                head.next = newnode;
                head =newnode;
            }
        }
        public class ll{
            public static void main(String[] args) {
                linklist2 list =new  linklist2();
                list.adddfirst(7);
                
            }
        }
    }


    

