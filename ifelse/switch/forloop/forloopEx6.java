
public class forloopEx6 {
    public static void main(String [] args){
        // System.out.println("enter a number");
        // int n = Sc.nextInt();
        java.util.Scanner Sc= new java.util.Scanner(System.in);
        System.out.println("enter a number");
        int n = Sc.nextInt();
        int Sum =0;
        for (int i =1;i<=n;i++){
            Sum+=i;
            System.out.println(Sum);
        }
    }
    
}
