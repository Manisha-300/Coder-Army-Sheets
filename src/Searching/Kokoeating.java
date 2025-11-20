class Kokoeating {
    public int minEatingSpeed(int[] piles, int h) {
         int left = 1, right = 0;
        for (int pile : piles) right = Math.max(right, pile);
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canEatAll(piles, h, mid)) {
                right = mid; // try smaller speed
            } else {
                left = mid + 1; // need faster speed
            }
        }
        
        return left;
    }
    
    private boolean canEatAll(int[] piles, int h, int k) {
        int hours = 0;
        for (int pile : piles) {
            hours += (pile + k - 1) / k; // ceil division
        }
        return hours <= h;
    }
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int[] piles = new int[n];
        for (int i = 0; i < n; i++) {
            piles[i] = sc.nextInt();
        }
        int h = sc.nextInt();
        Kokoeating kokoeating = new Kokoeating();
        int result = kokoeating.minEatingSpeed(piles, h);
        System.out.println(result);
        sc.close();
    }

}