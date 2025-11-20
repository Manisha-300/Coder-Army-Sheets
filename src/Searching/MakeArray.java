import java.util.Arrays;

public class MakeArray {
     public int minIncrements(int[] arr) {
        // Code here
        
        Arrays.sort(arr);
        int moves = 0;
        int prev = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= prev) {
                moves += (prev + 1 - arr[i]);
                arr[i] = prev + 1;  
            }
            prev = arr[i];
        }
        return moves;
    
    }
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        MakeArray ma = new MakeArray();
        int result = ma.minIncrements(arr);
        System.out.println(result);
        sc.close();
    }
}
