package program1;

public class MultipleCatchBlock {
    int calling(int a,int b,int result){
        try{
            System.out.println("try block");
            result=a/b;
        }
        catch(NullPointerException nullPointerException){
            System.out.println("catch block 1");
            System.out.println(nullPointerException);
        }
        catch(ArithmeticException arithmeticException){
            System.out.println("catch block 2");
            System.out.println(arithmeticException);
        }
        catch (Throwable throwable){
            System.out.println("catch block 3");
            System.out.println(throwable);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Single try catch finally example");
        int a=100;
        int b=0;
        int res=0;
        MultipleCatchBlock hello=new MultipleCatchBlock();
        System.out.println(hello.calling(a,b,res));
        System.out.println("calling done");
    }
}
