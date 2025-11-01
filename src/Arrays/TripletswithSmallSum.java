import java.util.Arrays;
import java.util.Scanner;

public class TripletswithSmallSum {
    
static long countTriplets(int n, int sum, long arr[]) {
        Arrays.sort(arr);
        long count = 0;

        for (int i = 0; i < n - 2; i++) {
            int l = i + 1, r = n - 1;
            while (l < r) {
                if (arr[i] + arr[l] + arr[r] < sum) {
                    count += (r - l); // all pairs from l+1 to r are valid
                    l++;
                } else r--;
            }
        }
        return count;
    }
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextLong();

                
                } 
                 long res=countTriplets(n ,sum,arr );
                 
                   System.out.println(res);



                sc.close()        ;
    }
}
