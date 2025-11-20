import java.util.Arrays;
import java.util.Scanner;

public class MinLap {
     public int minLaptops(int n, int[] start, int []end) {
        // code here
           Arrays.sort(start);
        Arrays.sort(end);

        int i = 0, j = 0;
        int laptops = 0, maxLaptops = 0;

        while (i < n && j < n) {
            if (start[i] < end[j]) {
                laptops++;
                maxLaptops = Math.max(maxLaptops, laptops);
                i++;
            } else {
                laptops--;
                j++;
            }
        }
        return maxLaptops;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] start = new int[n];
        int[] end = new int[n];
        for (int i = 0; i < n; i++) {
            start[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            end[i] = sc.nextInt();
        }
        MinLap ml = new MinLap();
        int result = ml.minLaptops(n, start, end);
        System.out.println(result);
        sc.close();
    }
    
}
