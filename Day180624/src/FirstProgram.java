public class FirstProgram {
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    double add(double a,double b){
        return a+b;
    }
    String add(String a,int b){
        return (a+" "+b);
    }
    public static void main(String args[]){
        FirstProgram Prog1=new FirstProgram();
        System.out.println(Prog1.add(10,20));
        System.out.println(Prog1.add(10,20,30));
        System.out.println(Prog1.add(10.5,20.1));
        System.out.println(Prog1.add("Hello",20));
    }
}
