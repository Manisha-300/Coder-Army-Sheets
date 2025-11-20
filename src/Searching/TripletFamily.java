import java.util.Arrays;

public class TripletFamily {
     public boolean findTriplet(int[] arr) 
    {
         Arrays.sort(arr);
        int n = arr.length;

        for (int k = 2; k < n; k++) {
            int i = 0;
            int j = k - 1;

            while (i < j) {
                int sum = arr[i] + arr[j];

                if (sum == arr[k]) {
                    return true;
                } else if (sum < arr[k]) {
                    i++;
                } else {
                    j--;
                }
            }
        }

        return false;
    }
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        TripletFamily tf = new TripletFamily();
        boolean result = tf.findTriplet(arr);
        System.out.println(result ? "Triplet found" : "No triplet found");
        sc.close();
    }
    
}
