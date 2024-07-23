package program2;
import java.util.*;
public class Age {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        try{
            if(age<21||age>80){
                InvalidAgeException invalidAgeException=new InvalidAgeException("Need Experience");
                throw invalidAgeException;
            }
            System.out.println("Great");
        }
        catch (InvalidAgeException invalidAgeException){
            System.out.println(invalidAgeException);
        }
    }
}
