package src.Strings;
import java.util.Scanner;

public class RemoveReverse {
    static String removeReverse(String s) {
        // code here
         
        StringBuilder sb = new StringBuilder(s);
        while (true) {
            int[] cnt = new int[26];
            for (int k = 0; k < sb.length(); k++) cnt[sb.charAt(k) - 'a']++;

            int removeIdx = -1;
            for (int i = 0; i < sb.length(); i++) {
                if (cnt[sb.charAt(i) - 'a'] > 1) {
                    removeIdx = i;
                    break;
                }
            }
            if (removeIdx == -1) break;      
            sb.deleteCharAt(removeIdx);       
            sb.reverse();                    
        }
        return sb.toString();
    }
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        String str=s.nextLine();
      
       String s1=removeReverse(str);

     System.out.println(s1);
        s.close();
    }
}
