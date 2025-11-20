public class Reachanum {

     public int reachNumber(int target) {
        target = Math.abs(target);  // symmetric for positive/negative

        long sum = 0;
        int moves = 0;

        while (sum < target || (sum - target) % 2 != 0) {
            moves++;
            sum += moves;
        }
        
        return moves;
    }
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int target = sc.nextInt();
        Reachanum rn = new Reachanum();
        int result = rn.reachNumber(target);
        System.out.println(result);
        sc.close();
    }
}
