import java.util.Scanner;

public class ThirdProgram {
    int largestNumber(int n1,int n2,int n3){
        if(n1>n2&&n1>n3) return n1;
        else if(n2>n3) return n2;
        return n3;
    }
    public static void main(String[] args) {
        ThirdProgram Prog3=new ThirdProgram();
        Scanner sc=new Scanner(System.in);
        System.out.println(Prog3.largestNumber(sc.nextInt(),sc.nextInt(),sc.nextInt()));
    }
}
