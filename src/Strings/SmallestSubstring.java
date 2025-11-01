package src.Strings;
public class SmallestSubstring {
     public static int smallestSubstring(String s) {
        // Code here
        int i = 0, res = Integer.MAX_VALUE;
        int[] c = new int[3];
        for (int j = 0; j < s.length(); j++) {
            c[s.charAt(j) - '0']++;
            while (c[0] > 0 && c[1] > 0 && c[2] > 0) {
                res = Math.min(res, j - i + 1);
                c[s.charAt(i++) - '0']--;
            }
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }
    public static void main(String[] args) {
         java.util.Scanner sc = new java.util.Scanner(System.in);
        String s = sc.nextLine();
        int result = smallestSubstring(s);
        System.out.println("Maximum occurring character: " + result);
        sc.close();
    }
}
