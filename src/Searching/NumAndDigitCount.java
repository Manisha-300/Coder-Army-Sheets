public class NumAndDigitCount {
     public static long numberCount(long N, long K) {
        long low = 1, high = N, ans = N + 1;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (mid - digitSum(mid) >= K) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (ans == N + 1) return 0;  // no number satisfies
        return N - ans + 1;
    }
    
    private static long digitSum(long x) {
        long sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        long N = sc.nextLong();
        long K = sc.nextLong();
        long result = numberCount(N, K);
        System.out.println(result);
        sc.close();
    }
}
