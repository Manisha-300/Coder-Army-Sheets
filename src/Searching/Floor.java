public class Floor {
      public int findFloor(int[] arr, int x) {
        // code here
         int n = arr.length;
    int low = 0, high = n - 1;
    int ans = -1;

    while (low <= high) {
        int mid = low + (high - low) / 2;

        if (arr[mid] <= x) {
            ans = mid;      // potential answer
            low = mid + 1;  // move right to find last occurrence ≤ x
        } else {
            high = mid - 1; // move left
        }
    }

    return ans;
    }
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        Floor floor = new Floor();
        int result = floor.findFloor(arr, x);
        System.out.println(result);
        sc.close();
    }
}
