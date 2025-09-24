public class Ex6 {
    

    public static void main(String args[]){
        System.out.println("see your pattern");
        java.util.Scanner Sc = new java.util.Scanner(System.in);
        System.out.println("enter the value of a ");
        int a = Sc.nextInt();
        System.out.println("enter the value of b");
        int b = Sc.nextInt();

        for(int i=1;i<=a;i++){
            for(int j=1;j<b;j++){
                System.out.print(j);

            }
            System.out.println();
        }
    }
    
}
