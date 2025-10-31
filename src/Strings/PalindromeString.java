import java.util.Scanner;

public class PalindromeString {
    static boolean isPalindrome(String s) {
        // code here
        int i = 0, j = s.length() - 1;
        while (i < j)
            if (s.charAt(i++) != s.charAt(j--))
                return false;
        return true;
    }
    public static void main(String[] args) {
                        Scanner sc=new Scanner(System.in);
         
       
        String  s1=sc.nextLine();
        Boolean res= isPalindrome(s1);
        System.out.println(res);
        sc.close();
    }
}
