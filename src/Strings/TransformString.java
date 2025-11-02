public class TransformString{
   static int transform(String A, String B) {
        // code here
        int n = A.length();
        if (n != B.length()) return -1;

        // Step 1: Check if both strings have same characters
        int[] freq = new int[256];
        for (char c : A.toCharArray()) freq[c]++;
        for (char c : B.toCharArray()) freq[c]--;
        for (int f : freq) if (f != 0) return -1;

        // Step 2: Count matching chars from end (core logic)
        int i = n - 1, j = n - 1;
        while (i >= 0) {
            if (A.charAt(i) == B.charAt(j))
                j--;
            i--;
        }
        return j + 1;
    }
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String s = sc.nextLine();
        String s2=sc.nextLine();


        int result=transform(s, s2);
        System.out.println("Maximum occurring character: " + result);
        sc.close();
    }
    
}
