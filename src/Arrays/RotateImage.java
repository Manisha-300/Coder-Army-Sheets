package src.Arrays;
public class RotateImage {
    public static void rotate(int[][] m) {
         int n = m.length;

        // transpose
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++) {
                int t = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = t;
            }

        // reverse each row
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n / 2; j++) {
                int t = m[i][j];
                m[i][j] = m[i][n - 1 - j];
                m[i][n - 1 - j] = t;
            }
    }
    public static void main(String[] args) {
         java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][];
        for (int i = 0; i < n; i++) {
            for(int j=0;j<n;j++)
            arr[i][j] = sc.nextInt();
        }
       rotate(arr);
        
        sc.close();
    }
    
}
