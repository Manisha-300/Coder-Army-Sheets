public class Bitonic {
     public int findMaximum(int[] arr) {
        // code here
        int n=arr.length;
         int low = 0, high = n - 1;

    while (low <= high) {
        int mid = low + (high - low) / 2;

        
        if ((mid == 0 || arr[mid] > arr[mid - 1]) &&
            (mid == n - 1 || arr[mid] > arr[mid + 1])) {
            return arr[mid];
        }

      
        if (mid < n - 1 && arr[mid] < arr[mid + 1]) {
            low = mid + 1;
        }
        
        else {
            high = mid - 1;
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
        Bitonic bitonic = new Bitonic();
        int result = bitonic.findMaximum(arr);
        System.out.println(result);
        sc.close();
    }
    
}
