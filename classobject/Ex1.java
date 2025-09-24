class employe1 {
    
    private String name;
    private int salary;
    private String cname;
    public void input(String n,int s,String c){
        name = n;
        salary=s;
        cname=c;
    }
    public String getName(){
        return name ;

    }
    // public void show(){
    //     System.out.println(name+" "+salary+" "+cname);
    // }
    
    }
    public class Ex1{
        public static void main(String[] args) {
            employe1 a=new employe1();
            employe1 b = new employe1();



            a.input("ranvijay",5888,"galgotia");
            b.input("priyanshu",4448,"galgotia");

            System.out.println(a.name);
           // System.out.println(a.salary());


            

            

        }
    }
    
