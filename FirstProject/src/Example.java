public class Example {
    public Example(byte var){
        System.out.println(var);
    }
    public  Example(){
//        System.out.println("c2");
        this((byte)4);
    }
    public static void main(String[] args) {
        Example ex=new Example();
    }
}
