import java.util.*;
public class FourthProgram {
    String digitsInWords(int digit){
        String[] num ={"zero","one","two","three","four","five","six","seven","eight","nine"};
        String output="";
        while(digit!=0){
            output=num[digit%10]+" "+output;
            digit/=10;
        }
        return output.trim();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        FourthProgram Prog4=new FourthProgram();
        System.out.println(Prog4.digitsInWords(sc.nextInt()));
    }
}
