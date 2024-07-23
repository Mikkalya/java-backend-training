public class Laptop {
    int SNo;
    String EmpName;
    String Model;
    float Price;
    void displayDetails(){
        System.out.println("SNo: "+SNo);
        System.out.println("Employee Name: "+EmpName);
        System.out.println("Model Name: "+Model);
        System.out.println("Price: "+(Price+(Price/5)));
    }

}
