package src.Arrays;
import java.util.Scanner;

public class BinarySearch {
     public void binSort(int[] arr) {
        // code here
        int n=arr.length;
        if(arr[0]<0 || arr[0]>1){
            System.out.println(" Invalid array element: " + arr[0] + " (must be 0 or 1)");
          
        }
         
        int size = arr.length;
        if (size < 1) {
            System.out.println(" Array size too small: " );
          
        }
        
        if (size > 1000000) {
            System.out.println(" Array size too large: " );
           
        }
        int left=0;
        int right=n-1;
       while(left<right){
           if(arr[left]==1 && arr[right]==0){
               int temp=arr[left];
               arr[left]=arr[right];
               arr[right]=temp;
               left++;
               right--;
           } if(arr[left]==0){
               left++;
           }if(arr[right]==1){
               right--;
           }
           
       }
   
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        BinarySearch sorter = new BinarySearch();
        sorter.binSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
