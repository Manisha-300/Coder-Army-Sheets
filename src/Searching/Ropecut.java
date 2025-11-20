import java.util.ArrayList;
import java.util.Arrays;

public class Ropecut {
     public ArrayList<Integer> RopeCutting(int arr[]) {
        // Complete the Function
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;

        // Sort the array first
        Arrays.sort(arr);

        int i = 0;
        while (i < n) {
            // Count how many ropes are left
            int remaining = n - i;
            if (remaining > 0) result.add(remaining);

            // Find the minimum positive rope length
            int cutLength = arr[i];

            // Cut all remaining ropes by cutLength
            while (i < n && arr[i] == cutLength) {
                i++;  // Skip ropes that become zero
            }
        }

     
        return result;
    }
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Ropecut rc = new Ropecut();
        ArrayList<Integer> result = rc.RopeCutting(arr);
        for (int count : result) {
            System.out.println(count);
        }
        sc.close();
    }
}
