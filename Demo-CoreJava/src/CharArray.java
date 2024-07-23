import java.util.Arrays;

public class CharArray {
    public static void main(String args[]){
        char consonants[]={'b','s','f','w','h'};
        int n=consonants.length;
        //sorting
        Arrays.sort(consonants);
        System.out.println(Arrays.toString(consonants));
        //reversing
        char reverse[]=new char[n];
        for(int i=0;i<n;i++){
            reverse[i]=consonants[n-i-1];
        }
        System.out.println(Arrays.toString(reverse));
        //searching
        char search='6';
        boolean flag=false;
        for(int i=0;i<n;i++){
            if(consonants[i]==search){
                flag=true;
                break;
            }
        }
        if(flag) System.out.println("Element "+search+" is found");
        else System.out.println("Element "+search+" is not found");
    }
}
