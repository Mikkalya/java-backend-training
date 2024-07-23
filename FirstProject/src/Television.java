public class Television {
    char model[]={'S','o','n','y',' ','A','1','0'};
    byte width=100;
    byte height=50;
    float price=36500.50f;
    boolean TVAvailability=false;
    void displayDetails(){
        System.out.print("Model is : " );
        for(int i=0;i<model.length;i++) System.out.print(model[i]);
        System.out.println("\nWidth is : " + width);
        System.out.println("Height is : " + height);
        System.out.println("Price is : " + (price+(price%5)));
        System.out.println("Is the TV Available : " + TVAvailability);
    }
    public static void main(String args[]){
        Television SonyTV=new Television();
        SonyTV.displayDetails();
    }
}
