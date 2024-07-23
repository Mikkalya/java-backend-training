package program1;

public class SingleTryCatchFinally {
    int calling(int a,int b,int result){
        try{
            System.out.println("try block");
            result=a/b;
        }
        catch(ArithmeticException arithmeticException){
            System.out.println("catch block");
            System.out.println(arithmeticException);
        }
        finally {
            System.out.println("finally block");
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Single try catch finally example");
        int a=100;
        int b=0;
        int res=0;
        SingleTryCatchFinally hello=new SingleTryCatchFinally();
        System.out.println(hello.calling(a,b,res));
        System.out.println("calling done");
    }
}
