package program1;

public class NestedTryCatchBlock {
    int calling(int a,int b,int result){
        try{
            System.out.println("try block");
//            result=a/b;
            try{
                System.out.println("nested try block");
                String name=null;
                String upper=name.toUpperCase();
            }
            catch(NullPointerException nullPointerException){
                System.out.println("nested catch block");
                System.out.println(nullPointerException);
            }
            finally {
                System.out.println("nested finally block");
            }
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
        NestedTryCatchBlock hello=new NestedTryCatchBlock();
        System.out.println(hello.calling(a,b,res));
        System.out.println("calling done");
    }
}
