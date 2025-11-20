package src.Searching;
import java.util.Arrays;
import java.util.Scanner;

public class MaxInteractions {
   
    public  static int maxIntersections(int[][] lines, int N) {
    int[] start = new int[N];
        int[] end = new int[N];

        for (int i = 0; i < N; i++) {
            start[i] = lines[i][0];
            end[i] = lines[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int i = 0, j = 0, count = 0, maxCount = 0;

        while (i < N && j < N) {
            // inclusive intersection => <= instead of <
            if (start[i] <= end[j]) {
                count++;
                maxCount = Math.max(maxCount, count);
                i++;
            } else {
                count--;
                j++;
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] lines = new int[N][2];
        for (int i = 0; i < N; i++) {
            lines[i][0] = sc.nextInt();
            lines[i][1] = sc.nextInt();
        }
        int result = maxIntersections(lines, N);
        System.out.println(result);
        sc.close();
        
        
    }
}
        
    
    

