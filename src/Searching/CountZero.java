import java.util.Scanner;

public class CountZero {
     static int countZeros(int A[][], int N) {
        // Your code here
        int row = 0, col = N - 1;
        int count = 0;

        while (row < N && col >= 0) {
            if (A[row][col] == 0) {
                // All elements from 0 to col are zeros
                count += (col + 1);
                row++; // move to next row
            } else {
                col--; // move left
            }
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] A = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        int result = countZeros(A, N);
        System.out.println(result);
        sc.close();
    }
}
