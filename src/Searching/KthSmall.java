import java.util.Arrays;

public class KthSmall {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        Arrays.sort(arr);
        
        
        return arr[k - 1];
    }
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        KthSmall ks = new KthSmall();
        int result = ks.kthSmallest(arr, k);
        System.out.println(result);
        sc.close();
    }
    
}
