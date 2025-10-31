package src.Arrays;
import java.util.Scanner;

public class TransitionPoint {
    static int transitionPoint(int arr[]) {
     int n = arr.length;
        int low = 0, high = n - 1;
        int ans = -1;

        // Binary search for first 1
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == 1) {
                ans = mid;     // potential answer
                high = mid - 1; // search left for first 1
            } else {
                low = mid + 1; // move right since arr[mid] = 0
            }
        }

        return ans;
    }
    public static void main(String[] args) {
     Scanner s= new Scanner(System.in);
       int n=s.nextInt();
                int [] arr=new int[n];
                for(int i=0;i<n;i++){
                    arr[i]=s.nextInt();
                }
            int res=transitionPoint(arr);
            System.out.println(res);
            s.close();

    }
}
