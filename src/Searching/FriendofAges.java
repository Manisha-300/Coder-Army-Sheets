public class FriendofAges {
    public int numFriendRequests(int[] ages) {
        int[] count = new int[121]; // ages[i] <= 120
        for (int age : ages) {
            count[age]++;
        }

        int total = 0;
        for (int ageA = 15; ageA <= 120; ageA++) {
            if (count[ageA] == 0) continue;
            for (int ageB = 0; ageB <= 120; ageB++) {
                if (count[ageB] == 0) continue;
                if (ageB <= 0.5 * ageA + 7) continue;
                if (ageB > ageA) continue;
                if (ageB > 100 && ageA < 100) continue;

                total += count[ageA] * count[ageB];
                if (ageA == ageB) total -= count[ageA]; // remove self-request
            }
        }

        return total;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = sc.nextInt();
        }
        FriendofAges foa = new FriendofAges();
        int result = foa.numFriendRequests(ages);
        System.out.println(result);
        sc.close();
    }
    
}
