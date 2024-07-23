package program3;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) throws WrongInputException {
        Scanner sc=new Scanner(System.in);
        int value=sc.nextInt();
        int check=25;
        try{
            if(value!=check){
//                WrongInputException wrongInputException=new WrongInputException("Input not met with the assigned value");
//                throw wrongInputException;
                throw new WrongInputException("Input not met with the assigned value");
            }
            System.out.println("Your input met with the assigned value and it's good to go!!!");
        }
        catch(WrongInputException wrongInputException){
            System.out.println(wrongInputException);
        }
    }
}
