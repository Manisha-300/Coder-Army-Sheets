package src.Arrays;
import java.util.Scanner;

public class BooleanMatrix {
    static  void booleanMatrix(int mat[][]) {
        // code here
        int r = mat.length, c = mat[0].length;
        boolean[] row = new boolean[r], col = new boolean[c];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                if (mat[i][j] == 1) {
                    row[i] = true;
                    col[j] = true;
                }

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                if (row[i] || col[j])
                    mat[i][j] = 1;
 for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                System.out.println(mat[i][j]+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int r=sc.nextInt();
            int c=sc.nextInt();
                   int [][] arr=new int [r][c];
                   for(int i=0;i<r;i++){
                    for(int j=0;j<c;j++){
                        arr[i][j]=sc.nextInt();
                    }
                   }
                  booleanMatrix(arr);

              
        sc.close();
    }
    
}
