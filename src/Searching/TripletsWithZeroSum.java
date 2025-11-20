import java.util.Arrays;

public class TripletsWithZeroSum {
     public boolean findTriplets(int[] arr) {
        // code here.
         int n = arr.length;
    Arrays.sort(arr);

    for (int i = 0; i < n - 2; i++) {
        int l = i + 1;
        int r = n - 1;

        while (l < r) {
            int sum = arr[i] + arr[l] + arr[r];

            if (sum == 0) {
                return true;
            }
            else if (sum < 0) {
                l++;  // need bigger sum
            }
            else {
                r--;  // need smaller sum
            }
        }
    }

    return false;
    
    }
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        TripletsWithZeroSum twzs = new TripletsWithZeroSum();
        boolean result = twzs.findTriplets(arr);
        System.out.println(result ? "Triplet with zero sum exists" : "No triplet with zero sum");
        sc.close();
    }
}
