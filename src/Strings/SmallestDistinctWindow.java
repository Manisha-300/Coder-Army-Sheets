package src.Strings;
import java.util.Scanner;

public class SmallestDistinctWindow {
     public static int findSubString(String s) {
        // code here
         int unique = (int) s.chars().distinct().count();
        int[] freq = new int[256];
        int start = 0, count = 0, min = s.length();

        for (int end = 0; end < s.length(); end++) {
            if (++freq[s.charAt(end)] == 1) count++;
            while (count == unique) {
                min = Math.min(min, end - start + 1);
                if (--freq[s.charAt(start++)] == 0) count--;
            }
        }
        return min;
    }
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        
        String  s=sc.nextLine();
        
        int res= findSubString(s);
     System.out.println(res);
     
        sc.close();
    }
    
}
