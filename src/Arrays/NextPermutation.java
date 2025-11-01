

public class NextPermutation {
     public static void nextPermutation(int[] nums) {
        int n=nums.length,i=n-2;
       while (i >= 0 && nums[i] >= nums[i + 1]) i--;

        if (i >= 0) {
            int j = n - 1;
            while (nums[j] <= nums[i]) j--;
           
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
         int start = i + 1, end = n - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }
    public static void main(String[] args) {
         java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        nextPermutation(arr);
        
        sc.close();
    }
}
