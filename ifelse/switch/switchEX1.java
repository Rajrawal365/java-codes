public class switchEX1 {
    public static void main(String[] args) {
        java.util.Scanner Sc = new java.util.Scanner(System.in);
        System.out.println("enter your choice");
        int monthno= Sc.nextInt();
        switch(monthno){
            case 1:
            System.out.println("sunday");
            break;
            case 2:
            System.out.println("monday");
            break;
            case 3:
            System.out.println("tuesday");
            break;
            case 4:
            System.out.println("wednesday");
            break;
            case 5:
            System.out.println("thursday");
            break;
            case 6:
            System.out.println("friday");
            break;
            case 7:
            System.out.println("saturday");
            break;
            default:
            System.out.println("invalid choice");
        }



        
    }
    
}
