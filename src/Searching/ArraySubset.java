import java.util.HashMap;

public class ArraySubset {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
         // Frequency map for array a
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int x : a) {
        map.put(x, map.getOrDefault(x, 0) + 1);
    }

    // Check elements of b
    for (int x : b) {
        if (!map.containsKey(x) || map.get(x) == 0) {
            return false; // element missing or insufficient frequency
        }
        map.put(x, map.get(x) - 1);
    }

    return true;

    }
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        ArraySubset arraySubset = new ArraySubset();
        boolean result = arraySubset.isSubset(a, b);
        System.out.println(result ? "Yes" : "No");
        sc.close();
    }
}
