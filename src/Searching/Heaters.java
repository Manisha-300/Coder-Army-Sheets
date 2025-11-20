import java.util.Arrays;

public class Heaters {
     public int findRadius(int[] houses, int[] heaters) {
        
         Arrays.sort(houses);
        Arrays.sort(heaters);

        int radius = 0;

        for (int house : houses) {
            int idx = Arrays.binarySearch(heaters, house);

            if (idx >= 0) {
                // house is exactly on a heater
                continue;
            }

            idx = -idx - 1;  // insertion point
            int leftDist = (idx - 1 >= 0) ? house - heaters[idx - 1] : Integer.MAX_VALUE;
            int rightDist = (idx < heaters.length) ? heaters[idx] - house : Integer.MAX_VALUE;

            int nearest = Math.min(leftDist, rightDist);
            radius = Math.max(radius, nearest);
        }

        return radius;
    
    }
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int[] houses = new int[n];
        for (int i = 0; i < n; i++) {
            houses[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] heaters = new int[m];
        for (int i = 0; i < m; i++) {
            heaters[i] = sc.nextInt();
        }
        Heaters ht = new Heaters();
        int result = ht.findRadius(houses, heaters);
        System.out.println(result);
        sc.close();
    }
    
}
