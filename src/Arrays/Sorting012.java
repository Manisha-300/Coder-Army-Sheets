package src.Arrays;
import java.util.Arrays;

public class Sorting012 {
    public void sort012(int[] arr) {
        // code here
        
        Arrays.sort(arr);
       
    
    }
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Sorting012 sorter = new Sorting012();
        sorter.sort012(arr);
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
