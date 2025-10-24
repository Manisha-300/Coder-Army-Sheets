
import java.util.Scanner;

public class Search1 {
    public static int Search(int[] arr, int target) {
        int n = arr.length;
        if (n < 1) {
            System.out.println("Array cannot be empty");
        }
        if (n > 100000) {
                      System.out.println ("Array size too large: " + n + " > 100,000");
        }
        if (target < 0) {
                      System.out.println("Target cannot be negative: " + target);
        }
        if (target > 20000000) {
                       System.out.println
                       ("Target too large: " + target + " > 20,000,000");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Target found at index i
            }
        }
        return -1; // Target not found
    }
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid; // Target found at index mid
            }
            if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return -1; // Target not found
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int [] arr2=new int [n];
        for(int i=0;i<n;i++){
            arr2[i]=scanner.nextInt();
        }
        int target2=scanner.nextInt();
        int result2=Search(arr2,target2);
        System.out.println("Linear Search on user input: Target found at index " + result2);
    //    int result3=binarySearch(arr2,target2);
    //    System.out.println("Binary Search on user input: Target found at index " + result3);

        // int[] arr = {1, 3, 5, 7, 9, 11};
        // int target = 7;

        // int linearResult = linearSearch(arr, target);
        // System.out.println("Linear Search: Target found at index " + linearResult);

        // int binaryResult = binarySearch(arr, target);
        // System.out.println("Binary Search: Target found at index " + binaryResult);
    
    scanner.close();
    }
}
