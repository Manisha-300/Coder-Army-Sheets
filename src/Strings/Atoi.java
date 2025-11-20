package src.Strings;
public class Atoi {
     public static int atoi(final String s) {
          if (s == null || s.isEmpty()) return 0;

        int i = 0, n = s.length(), sign = 1;
        long result = 0;

        // Step 1: Skip leading spaces
        while (i < n && s.charAt(i) == ' ') i++;

        // Step 2: Check sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Step 3: Convert digits to number
        while (i < n && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');

            // Step 4: Check overflow
            if (sign * result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign * result < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++;
        }

        return (int)(sign * result);
    
    }
     public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String s = sc.nextLine();
        int result = atoi(s);
        System.out.println("Maximum occurring character: " + result);
        sc.close();
     }
}
