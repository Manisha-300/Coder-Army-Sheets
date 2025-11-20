import java.util.HashMap;

public class MoreThannkoccur {
    
    public int countOccurence(int[] arr, int k) {
        // your code here,return the answer
          int n = arr.length;
    HashMap<Integer, Integer> map = new HashMap<>();

    // Count frequencies
    for (int x : arr) {
        map.put(x, map.getOrDefault(x, 0) + 1);
    }

    int cnt = 0;
    int limit = n / k;

    // Count elements occurring more than n/k times
    for (int key : map.keySet()) {
        if (map.get(key) > limit) {
            cnt++;
        }
    }

    return cnt;
    }
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        MoreThannkoccur mtko = new MoreThannkoccur();
        int result = mtko.countOccurence(arr, k);
        System.out.println(result);
        sc.close();
    }
}
