public class ExceptionHandling {
    public static void main(String[] args) {

        //NullPointerException

//        Object test=null;
//        test.toString();

//        String str=null;
//        System.out.println(str.toUpperCase());

        String str="null";
        System.out.println(str.toUpperCase());
        System.out.println("begin");
        called();
        System.out.println("end");
    }
    public static void called(){
        System.out.println("started");
        //ArithmeticException
        int a=0;
        int b=37498;
        int result=0;
        try{
            result=b/0;
        }
//        Required type:
//Throwable
        catch(ArithmeticException ae){
            System.out.println("Divide By Zero "+ae);
        }
        System.out.println("ended");
    }
}
