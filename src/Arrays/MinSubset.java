package src.Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class MinSubset {
      public static int numOfSubset(int[] arr) {
        // Your code goes here
         Arrays.sort(arr);
        int count = 1; // At least one subset

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1] + 1)
                count++; // Gap found → new subset
        }

        return count;
    
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        int n=sc.nextInt();
        int [] a=new int [n];
         for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int res= numOfSubset(a);
        System.out.println(res);
        sc.close();
    }
    
}
