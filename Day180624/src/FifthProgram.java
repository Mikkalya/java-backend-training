public class FifthProgram {
    public static void main(String args[]){
//        FifthProgram Prog5=new FifthProgram();
        //charAt
        String name="Mikkalya";
        System.out.println(name.charAt(6));
        for(int i=0;i<name.length();i++){
            System.out.print(name.charAt(i)+" ");
        }
        System.out.println();
        //contains
        System.out.println(name.contains("al"));
        //length
        System.out.println(name.length());
        //indexOf
        System.out.println(name.indexOf('a'));
        //equals
        System.out.println(name.equals("mikkalya"));
        //equalsIgnoreCase
        System.out.println(name.equalsIgnoreCase("mikkalya"));
        //join
        String department="CSE";
        System.out.println(department.concat("(BE)"));
        //lastIndexOf
        System.out.println(name.lastIndexOf('a'));
        //substring
        System.out.println(name.substring(2,5));
        //tolowercase
        System.out.println(name.toLowerCase());
        //touppercase
        System.out.println(name.toUpperCase());
        //trim
        String str="Hello      ,            World      ";
        System.out.println("start "+str+" end");
        System.out.println("start "+str.trim()+" end");
        String s[]=str.trim().split("\\s*,\\s*");
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }

    }
}
