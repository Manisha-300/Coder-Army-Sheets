package src.Strings;
import java.util.Scanner;

public class StringDuplicatesRemoval {
 static String  removeDuplicates(String s) {
         StringBuilder res = new StringBuilder();
        boolean[] seen = new boolean[256];
        for (char c : s.toCharArray())
            if (!seen[c]) { res.append(c); seen[c] = true; }
        return res.toString();
    }   
 public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
         
       
        String  s1=sc.nextLine();
        String res= removeDuplicates(s1);
        System.out.println(res);
        sc.close();
 }
}
