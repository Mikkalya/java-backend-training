import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayStore {
    void displayArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ArrayStore store=new ArrayStore();
        //Accept 10 integers and store them into the array.
        int n=10;
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        //Display the elements of the array using while & for loops
        System.out.println("Displaying array elements using for loop");
        for(int i=0;i<n;i++) System.out.print(array[i]+" ");
        System.out.println();
        System.out.println("Displaying array elements using while loop");
        int x=0;
        while(x<n){
            System.out.print(array[x]+" ");
            x++;
        }
        System.out.println();
        //Sort the array
        //inbuilt function
//        Arrays.sort(array);
        //manually
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(array[i]>array[j]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        store.displayArray(array);
        //Accept a number and return the number of times it occurs in the array
        int num=2;
        int count=0;
        for(int i=0;i<n;i++){
            if(array[i]==num) count++;
        }
        System.out.println(count);
        //Insert a number into the array at a specified position
        int pos=5;
        for(int i=n-1;i>=pos;i--){
            array[i]=array[i-1];
        }
        System.out.print("Enter the number to insert position 5: ");
        array[pos-1]=sc.nextInt();
        store.displayArray(array);
        //Return array that excludes duplicate elements in the original array. E.g. if the elements of the original array are [9,2,2,9,10,9] then return [9,2,10]
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(!li.contains(array[i])){
                li.add(array[i]);
            }
        }
        System.out.println(li);
    }
}
