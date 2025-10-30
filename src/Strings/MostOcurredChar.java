public class MostOcurredChar {

     public static char getMaxOccuringChar(String s) {
        // code here
        int[] freq = new int[26];
        
        // Count frequency of each character
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        
        int maxFreq = 0;
        char result = 'z'; // Start with largest lexicographically
        
        // Find character with maximum frequency
        for (int i = 0; i < 26; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                result = (char)('a' + i);
            } else if (freq[i] == maxFreq && freq[i] > 0) {
                // If same frequency, choose lexicographically smaller
                char currentChar = (char)('a' + i);
                if (currentChar < result) {
                    result = currentChar;
                }
            }
        }
        
        return result;
        
       
    }
 public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String s = sc.nextLine();
        char result = getMaxOccuringChar(s);
        System.out.println("Maximum occurring character: " + result);
        sc.close();
    }
}
