package program4;
import java.util.Scanner;
public class FourthProgram {
    public static void main(String[] args) {
        LearningModule learningModule=new LearningModule();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter name: ");
        String name=scanner.nextLine();
        System.out.println("Enter age: ");
        int age=scanner.nextInt();
        try{
            System.out.println(learningModule.getLearningCode(name,age));

        }
        catch(WrongInputException wrongInputException){
            System.out.println(wrongInputException.getMessage());
        }
    }
}
class WrongInputException extends RuntimeException{
    WrongInputException(String message){
        super(message);
    }
}
class InvalidAgeException extends Exception{
    InvalidAgeException(String message){
        super(message);
    }
}
class LearningModule{
    public String getLearningCode(String name,int age) throws WrongInputException {
        String ageCode="";
        try{
            AgeValidator ageValidator=new AgeValidator();
            ageCode=ageValidator.getAgeCode(age);

        }
        catch (InvalidAgeException invalidAgeException) {
            throw new WrongInputException(invalidAgeException.getMessage());
        }
        return name+" "+ageCode;
    }
}
class AgeValidator{
    public String getAgeCode(int age) throws InvalidAgeException{

            if(age>18) return "Adult";
            else if(age>=0) return "Child";
//            return throw new InvalidAgeException("Age is Invalid");
            else
                throw new InvalidAgeException("Age is Invalid");

    }
}
