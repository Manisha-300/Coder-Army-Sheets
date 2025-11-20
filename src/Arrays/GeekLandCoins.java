package src.Arrays;
import java.util.Scanner;

public class GeekLandCoins {
     public static int Maximum_Sum(int a[][], int n, int k) {
        // Your code goes here
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= n - k; i++)
            for (int j = 0; j <= n - k; j++) {
                int sum = 0;
                for (int x = i; x < i + k; x++)
                    for (int y = j; y < j + k; y++)
                        sum += a[x][y];
                max = Math.max(max, sum);
            }
        return max;
    }
         public static void main(String[] args) {
            Scanner s= new Scanner(System.in);
           int n=s.nextInt();
           int k=s.nextInt();
                int [][] arr=new int[n][];
                for(int i=0;i<n;i++){
                    for(int j=0;j<n;j++)
                    arr[i][j]=s.nextInt();
                }  
                int res = Maximum_Sum(arr, n, k);
                System.out.println(res);
               
               s.close();
         }
    
}
