import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MinSwaps {
     public static  int minSwaps(int arr[]) {
        // Code here
          int n = arr.length;
        // Pair value with original index
        int[][] arrPos = new int[n][2];
        for (int i = 0; i < n; i++) {
            arrPos[i][0] = arr[i];
            arrPos[i][1] = i;
        }

        // Sort by array values
        Arrays.sort(arrPos, Comparator.comparingInt(a -> a[0]));

        boolean[] visited = new boolean[n];
        int swaps = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i] || arrPos[i][1] == i) continue;

            int cycle_size = 0;
            int j = i;
            while (!visited[j]) {
                visited[j] = true;
                j = arrPos[j][1];
                cycle_size++;
            }

            if (cycle_size > 0) swaps += (cycle_size - 1);
        }

        return swaps;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = minSwaps(arr);
        System.out.println(result);
         sc.close();

       
    }
    
}
