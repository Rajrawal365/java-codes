import java.util.*;
public class Ex4 {
    int x;
    static void m2(){
        System.out.println("helloo raj");
        m1();

    }
    //   static int x;
    public static void main(String [] args){
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter youir value");
        int x = Sc.nextInt();
        
         if(x<=10){
                System.out.println( "hello nikhil"+ x++);
                m2();
                
            }
            else{
                System.out.println("its an error");
            }
        
        System.out.println("hii main");
         

      
        }
        static void m1(){
            System.out.println("helloo ran vijay");
            // if(x<=10){
            //     System.out.println( "hello nikhil"+ x++);
            //     m2();
                
            // }
            // else{
            //     System.out.println("its an error");
            // }

            }


        }
    
    
