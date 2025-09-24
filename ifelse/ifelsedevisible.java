public class ifelsedevisible {
    public static void main(String [] args){
        java.util.Scanner Sc = new java.util.Scanner(System.in);
        System.out.println("enter your numbber");
        int num = Sc.nextInt();
        if(num%5==0 && num%3==0){
            System.out.println("num is divisible by 5 and 3");
        }
        else if (num % 3==0){
            System.out.println("num is divisible by3");
        }
        else if( num % 5 ==0){
            System.out.println("num is dividible by 5");

        }else{
            System.out.println("invalid num");

        }
        System.out.println("thanks for usuing this app");



    }
    
}
