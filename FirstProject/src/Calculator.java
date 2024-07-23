public class Calculator {
    int add(int a,int b){
        System.out.print("Addition Result : ");
        return a+b;
    }
    int subtract(int a, int b){
        System.out.print("Subtraction Result : ");
        return (int)(Math.abs(a-b));
    }
    int multiply(int a,int b){
        System.out.print("Muliplication Result : ");
        return a*b;
    }
    float divide(int a,int b){
        System.out.print("Division Result : ");
        return (float)a/(float)b;
    }
}
