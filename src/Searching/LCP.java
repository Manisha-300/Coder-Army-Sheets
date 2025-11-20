import java.util.Scanner;

public class LCP {
     public String lcp(String arr[], int N) {
        // Write your code here
         if (N == 0) return "";
        
        String prefix = arr[0];
        
        for (int i = 1; i < N; i++) {
            // Compare prefix with each string
            while (arr[i].indexOf(prefix) != 0) {
                // Reduce prefix length
                prefix = prefix.substring(0, prefix.length() - 1);
                
                // If prefix becomes empty, return "-1" (as per GFG requirement)
                if (prefix.isEmpty())
                    return "-1";
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.next();
        }
        LCP lcpFinder = new LCP();
        String result = lcpFinder.lcp(arr, N);
        System.out.println(result);
        sc.close();
    }
}
