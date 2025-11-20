public class TwoRepeatElements {
     public int[] twoRepeated(int[] arr) {
        int n = arr.length - 2;

        int[] freq = new int[n + 1];
        int[] ans = new int[2];
        int idx = 0;

        for (int x : arr) {
            freq[x]++;

            if (freq[x] == 2) {   // second appearance
                ans[idx++] = x;
                if (idx == 2) break;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 2];
        for (int i = 0; i < n + 2; i++) {
            arr[i] = sc.nextInt();
        }
        TwoRepeatElements tre = new TwoRepeatElements();
        int[] result = tre.twoRepeated(arr);
        System.out.println(result[0] + " " + result[1]);
        sc.close();
    }
}
