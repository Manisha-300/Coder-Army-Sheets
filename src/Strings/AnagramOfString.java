import java.util.Scanner;

public class AnagramOfString {
     public static int remAnagrams(String s1, String s2) {
        // add code here.
   
    int[] f = new int[26];
        for (char c : s1.toCharArray()) f[c - 'a']++;
        for (char c : s2.toCharArray()) f[c - 'a']--;
        int res = 0;
        for (int x : f) res += Math.abs(x);
        return res;
   
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        String  s1=sc.nextLine();
        int res= remAnagrams(s,s1);
        System.out.println(res);
               sc.close();
    }
    
}
