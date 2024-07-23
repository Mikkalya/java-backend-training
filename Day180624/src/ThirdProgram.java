public class ThirdProgram {
    void multiplyUsingFor(int a){
        System.out.println("Multiplication Using For loop");
        for(int i=1;i<=10;i++){
            System.out.println(a+" * "+i+" = "+(a*i));
        }
        System.out.println();
    }
    void multiplyUsingWhile(int a){
        System.out.println("Multiplication Using While loop");
        int i=1;
        while(i<=10){
            System.out.println(a+" * "+i+" = "+(a*i));
            i++;
        }
        System.out.println();
    }
    void multiplyUsingDoWhile(int a){
        System.out.println("Multiplication Using Do-While loop");
        int i=1;
        do{
            System.out.println(a+" * "+i+" = "+(a*i));
            i++;
        }while(i<=10);
    }
    public static void main(String args[]){
        ThirdProgram Prog3=new ThirdProgram();
        int val=2;
        Prog3.multiplyUsingFor(val);
        Prog3.multiplyUsingWhile(val);
        Prog3.multiplyUsingDoWhile(val);
    }
}
