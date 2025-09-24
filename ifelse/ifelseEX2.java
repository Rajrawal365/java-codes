public class ifelseEX2 {
    public static void main(String [] args){
        java.util.Scanner Sc = new java.util.Scanner(System.in);
        int a,b,c,d,e;
        System.out.println("enter the six number" );

     a = Sc.nextInt();

    b= Sc.nextInt();

    c = Sc.nextInt();

    d = Sc.nextInt();

    e = Sc.nextInt();
     if(a>b && a>c && a>d && a>e){
        System.out.println(a+" is greatest");
     }else if( b>c && b>d &&b>e){
        System.out.println(b+" is greater");
     }
        else if( c>d && c>e ){
            System.out.println(c +" is greatest" );
        }
            else if (d>e){
                System.out.println(d+ "is greatest");
            }
            else{
                System.out.println(e +" is greatest");
            }
        }

        
           

            }
        