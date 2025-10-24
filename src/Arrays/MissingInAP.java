package src.Arrays;



import java.util.Scanner;

public class MissingInAP {
    
     public int findMissing(int[] arr) {
        // code here
       // Fast constraint checking for competitions
        int n = arr.length;
        
        // Quick size check
        if (n < 2 || n > 100000) return -1;
        
        // Quick value check
        for (int num : arr) {
            if (num < 0 || num > 20000000) return -1;
        }
     
        
        if (n < 2) {
            return arr[0]; // Handle single element case
        }
        
        int diff = (arr[n - 1] - arr[0]) / n;
        
        // Binary search approach that works for both directions
        int left = 0, right = n - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int expected = arr[0] + mid * diff;
            
            if (arr[mid] == expected) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return arr[0] + left * diff;
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of elements in the AP array:");  
        int n= s.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the elements of the AP array:");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        MissingInAP obj= new MissingInAP();
        int missing= obj.findMissing(arr);
              
        System.out.println( missing);
        s.close();
    }
}
