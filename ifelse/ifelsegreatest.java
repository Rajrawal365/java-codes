public class ifelsegreatest {
    public static void main(String[] args){
        java.util.Scanner Sc = new java.util.Scanner(System.in );
        System.out.println("enter the value of a ");
                int a = Sc.nextInt();

       
        System.out.println("enter the value of b");
         int b = Sc.nextInt();
     
        System.out.println("Enter the value of c");
           int c = Sc.nextInt();
        if(a==b && b==c && a==c){
            System.out.println("all are equal to each and every one");
        }else {
            if (a>b){
                if(a>c){
                      System.out.println("A is greatest");

                }else {
                    System.out.println("c is gretaest");
                    
                }
            }else{
                if(b>a){
                System.out.println("b is greter");
            }else if(b>c){
                System.out.println(" b is greatest");
            }
            else{
                System.out.println(" c is greater");

            }
            System.out.println("thanks for using the app");
        }

    }
    
}
}
