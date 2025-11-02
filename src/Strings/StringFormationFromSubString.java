import java.util.Scanner;

public class StringFormationFromSubString {
   static int isRepeat(String s) {
        // code here
         String doubled = s + s;
        return doubled.substring(1, doubled.length() - 1).contains(s) ? 1 : 0;
    }
    
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        String str=s.nextLine();
      
       int s1=isRepeat(str);
     System.out.println(s1);
        s.close();
    }
}
