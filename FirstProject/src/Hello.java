import java.util.ArrayList;
import java.util.List;

public class Hello {
    List<Hello> li=new ArrayList<>();
    void addMethod(Hello ob){
        li.add(ob);
    }
    void display(){
        System.out.println(li);
    }


    public static void main(String[] args) {
        Hello hello=new Hello();
        hello.addMethod(hello);
        Hello hello1=new Hello();
        hello1.addMethod(hello1);
        hello.display();
    }
}
