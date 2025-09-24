
public class forloopEX7 {
    public static void main(String[] args){
        java.util.Scanner Sc= new java.util.Scanner(System.in);
        System.out.println("enter the number");
        int n = Sc.nextInt();
         int mul =1;
         for(int i=1;i<=n;i++){
            mul*=i;
            // System.out.println("multiply up to your number is"+ mul);



            System.out.print(i);
			if(i!=n) {
				System.out.print("*");
			}else {
				System.out.print("=");
         }System.out.println(mul);
         }



    }
    
}
