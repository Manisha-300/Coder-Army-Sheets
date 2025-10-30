public class PeakElement {
     public static int  peakElement(int[] arr) {
        // code here
        int n = arr.length;
    
    for (int i = 0; i < n; i++) {
        boolean greaterThanLeft = (i == 0) || (arr[i] > arr[i - 1]);
        boolean greaterThanRight = (i == n - 1) || (arr[i] > arr[i + 1]);
        
        if (greaterThanLeft && greaterThanRight) {
            return i;
        }
    }
    
    return -1;
    }
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int peakIndex = peakElement(arr);
        
        System.out.println("Index of a peak element: " + peakIndex);
        sc.close();
    }
}
