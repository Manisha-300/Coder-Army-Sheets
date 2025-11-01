package src.Arrays;
import java.util.Scanner;

public class Rowmax1 {
    public static int rowWithMax1s(int arr[][]) {
        // code here
         int n = arr.length, m = arr[0].length;
        int row = -1, j = m - 1;

        for (int i = 0; i < n; i++) {
            while (j >= 0 && arr[i][j] == 1) {
                j--;
                row = i;
            }
        }
        return row;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          int r=sc.nextInt();
            int c=sc.nextInt();
                   int [][] arr=new int [r][c];
                   for(int i=0;i<r;i++){
                    for(int j=0;j<c;j++){
                        arr[i][j]=sc.nextInt();
                    }
                   }
                   int res=rowWithMax1s(arr);
                System.out.println(res);
                   sc.close();
    
    }
}
