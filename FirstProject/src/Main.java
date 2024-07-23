import java.util.*;
public class Main {
    public static void main(String args[]){


//        Television SonyTV = new Television();
//        SonyTV.displayDetails();


//        Scanner sc=new Scanner(System.in);
//        Calculator cal=new Calculator();
//        System.out.println("Enter two values for calculation:");
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        System.out.println("Related number to do the calculation such as " +
//                "\n0 for stop execution\n1 for add\n2 for subtraction\n3 for " +
//                "multiplication\n4 for division\nother number will provide invalid operation");
//        System.out.println("Provide any number");
//        int operation=sc.nextInt();
//        while(operation!=0) {
//            switch (operation) {
//                case 1:
//                    System.out.println(cal.add(a, b));
//                    break;
//                case 2:
//                    System.out.println(cal.subtract(a, b));
//                    break;
//                case 3:
//                    System.out.println(cal.multiply(a, b));
//                    break;
//                case 4:
//                    System.out.println(cal.divide(a, b));
//                    break;
//                default:
//                    System.out.println("Invalid Operation");
//                    break;
//            }
//            System.out.println("Provide any number");
//            operation=sc.nextInt();

//            Charger PhCharger=new Charger();

//            Laptop lenovo=new Laptop();

                Scanner sc=new Scanner(System.in);
                int n=3;
                Laptop laptops[] = new Laptop[n];
                laptops[0] = new Laptop();
                laptops[0].SNo=1;
                laptops[0].EmpName="Mikkalya";
                laptops[0].Model="lenovo";
                laptops[0].Price=42000;
                laptops[1] = new Laptop();
                laptops[1].SNo=2;
                laptops[1].EmpName="Nandhini";
                laptops[1].Model="hp";
                laptops[1].Price=39000;
                laptops[2] = new Laptop();
                laptops[2].SNo=3;
                laptops[2].EmpName="Sruthi";
                laptops[2].Model="dell";
                laptops[2].Price=49500;
                System.out.println("Provide SNo for searching: ");
                int val=sc.nextInt();
                for(int i=0;i<n;i++){
                    if(laptops[i].SNo==val){
                        laptops[i].displayDetails();
                        break;
                    }
                }
//                for(int i=0;i<n;i++){
//                    laptops[i].displayDetails();
//                }
                System.out.println("Provide SNo for updating the price of laptop: ");
                int num=sc.nextInt();
                for(int i=0;i<n;i++){
                    if(laptops[i].SNo==num){
                        laptops[i].Price=38567;
                        laptops[i].displayDetails();
                        break;
                    }
                }
//                for(int i=0;i<n;i++){
//                    laptops[i].displayDetails();
//                }
                System.out.println("Provide SNo for deleting the entire details: ");
                int x=sc.nextInt();
                for(int i=0;i<n;i++){
                    if(laptops[i].SNo==x) {
                        laptops[i] = null;
                        break;
                    }
                }
                for(int i=0;i<n;i++){
                    if(laptops[i]!=null)laptops[i].displayDetails();
                }
                System.out.println(Integer.toString((int)(laptops[0].Price)));
    }
}
