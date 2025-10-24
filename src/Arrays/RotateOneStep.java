package src.Arrays;
import java.util.Scanner;

public class RotateOneStep {

     public void rotate(int[] arr) {
        // code here
          // Check constraints
        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        if (arr.length < 2) {
            return; // No rotation needed for 0 or 1 element
        }
        if (arr.length > 100000) {
            throw new IllegalArgumentException("Array too large");
        }
       int last = arr[arr.length - 1];
        
        // Shift all elements to the right by one position
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        
        // Place the last element at the beginning
        arr[0]  = last;
  
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");

        int n= s.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        RotateOneStep obj= new RotateOneStep();
        obj.rotate(arr);
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        s.close();
    }
}
