public class DoWhileLoopEx2 {
	public static void main(String[] args) {
          String choice;
        do{
          
        java.util.Scanner Sc = new java.util.Scanner(System.in);
        System.out.println("enter your number");
        int n = Sc.nextInt();
        System.out.println("square of your number is "+  n*n);

        System.out.println("DO you want to  continue?"+"yes/no");
        choice= Sc.next();
        
        }while(choice.equals("yes"));
        System.out.println("tthanks for using ");

    }
}
