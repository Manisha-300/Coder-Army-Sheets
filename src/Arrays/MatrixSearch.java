import java.util.Scanner;

public class MatrixSearch {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
         if (m < 1  && n>100) {
            System.out.println(" Invalid number of rows and columns : " 
                             );
            return false;
        }
        if (target >10000) {
            System.out.println(" Target value too large: " + target + " > 10,000");
            return false;
        }
        
        

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==target){
                    return true;
                }
                
            }
        }
return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int target = sc.nextInt();
        MatrixSearch ms = new MatrixSearch();
        boolean found = ms.searchMatrix(matrix, target);
        System.out.println("Target found: " + found);
        sc.close();
    }
    
}
