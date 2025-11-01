package src.Strings;
import java.util.Scanner;

public class LengthofLastWord {
      public static int lengthOfLastWord(String s) {
          s = s.trim();
        return s.length() - s.lastIndexOf(' ') - 1;
    }
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
         
       
        String  s1=sc.nextLine();
        int  res= lengthOfLastWord(s1);
        System.out.println(res);
        sc.close();
    }
    
}
