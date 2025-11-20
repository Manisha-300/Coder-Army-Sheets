package src.Arrays;
public class CountPrimes {
    public static int countPrimes(int n) {
      if (n <= 2) return 0;
        boolean[] prime = new boolean[n];
        for (int i = 2; i * i < n; i++)
            if (!prime[i])
                for (int j = i * i; j < n; j += i)
                    prime[j] = true;

        int count = 0;
        for (int i = 2; i < n; i++)
            if (!prime[i]) count++;
        return count;
    } 
    public static void main(String[] args) {
                 java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int res=countPrimes(n);
        System.out.println(res);
        sc.close();
    }
    
}
