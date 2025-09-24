public class ifelseEX {
    public static void main(String [] args){
        System.out.println("enter your age pls");
        java.util.Scanner Sc = new java.util.Scanner(System.in);
        int age= Sc.nextInt();
        if(age<0 || age>120){
            System.out.println("invalid age ");
        }else if(age<10){
            System.out.println("you are a kid ");
        }
            else if (age<18){
                System.out.println("you are a teenager");

            }
            else if (age>18){
                System.out.println("you are a adult");
            }


    
    }
    
}
