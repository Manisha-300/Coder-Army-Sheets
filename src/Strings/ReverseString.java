package src.Strings;
import java.util.Scanner;

public class ReverseString {
     public static String reverseString(String s) {
        // code here
         if (s == null || s.length() <= 1) {
            return s;
        }
        int l=0,r=s.length()-1;
        char[] ch= s.toCharArray();
        
        
        
        while(l<r){
            char temp=ch[l];
            ch[l]=ch[r];
            ch[r]= temp;
            l++;
            r--;

        }
       return new String(ch);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        String str=s.nextLine();
        System.out.println("Reversed String is:");
        String reversed= reverseString(str);
        System.out.println(reversed);
        s.close();
    }
}
