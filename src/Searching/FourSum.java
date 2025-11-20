import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class FourSum {
     public  static ArrayList<ArrayList<Integer>> fourSum(int[] arr, int target) {
        // code here
          Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int n = arr.length;

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && arr[j] == arr[j - 1]) continue;

                int left = j + 1, right = n - 1;

                while (left < right) {
                    int sum = arr[i] + arr[j] + arr[left] + arr[right];

                    if (sum == target) {
                        // Adding ArrayList explicitly to avoid type issue
                        result.add(new ArrayList<>(Arrays.asList(
                                arr[i], arr[j], arr[left], arr[right]
                        )));

                        while (left < right && arr[left] == arr[left + 1]) left++;
                        while (left < right && arr[right] == arr[right - 1]) right--;

                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
       
        ArrayList<ArrayList<Integer>> result = fourSum(arr, target);

        
        
        System.out.println("Quadruplets summing to " + target + ": " + result);
        sc.close();
   
    }

    
}
