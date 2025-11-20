import java.util.Scanner;

public class SmallestMinNUm {
     public int missingNumber(int[] arr) {
        // code here
          int n = arr.length;

       
        for (int i = 0; i < n; i++) {
            if (arr[i] <= 0 || arr[i] > n) {
                arr[i] = n + 1;
            }
        }

      
        for (int i = 0; i < n; i++) {
            int num = Math.abs(arr[i]);
            if (num <= n) {
                arr[num - 1] = -Math.abs(arr[num - 1]);
            }
        }

       
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                return i + 1;
            }
        }

  
        return n + 1;
    }
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        SmallestMinNUm smn = new SmallestMinNUm();
        int result = smn.missingNumber(arr);
        System.out.println(result);
        sc.close();
   
   
    }
}
