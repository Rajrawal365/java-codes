public class ScannerExample{
    public static void main(String [] args){
        java.util.Scanner Sc = new java.util.Scanner(System.in);
        System.out.println("enter the value for a ");
        int a =Sc.nextInt();
  
        System.out.println("enter thye vaslue of double");
        double b = Sc.nextDouble();
        
        double c = (double)a+b; 
        System.out.println(c);



    }
    
}
