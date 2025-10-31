package src.Strings;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collections;
// import java.util.List;
import java.util.Scanner;

public class ReverseWords {
     public static String reverseWords(String s) {
        // Code here
         String[] words = s.split("\\.+"); // split by one or more dots
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].isEmpty()) {
                sb.append(words[i]);
                if (i > 0) sb.append(".");
            }
        }
        return sb.toString();
    }
    //  public String 2reverseWords(String s) {
    //     // Code here
    //       List<String> list = new ArrayList<>(Arrays.asList(s.split("\\.+")));
    //     list.removeIf(String::isEmpty);
    //     Collections.reverse(list);
    //     return String.join(".", list);
    // }
    public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
         
       
        String  s1=sc.nextLine();
        String res= reverseWords(s1);
        System.out.println(res);
        sc.close();
    }
    
}
