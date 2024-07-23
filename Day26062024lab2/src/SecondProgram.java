import java.util.*;
public class SecondProgram {
    String welcomeMessage(String name){
        return "Hello "+name+", Welcome to Java World!";
    }
    public static void main(String args[]){
        SecondProgram Prog2=new SecondProgram();
        Scanner sc=new Scanner(System.in);
        System.out.println(Prog2.welcomeMessage(sc.next()));
    }
}
