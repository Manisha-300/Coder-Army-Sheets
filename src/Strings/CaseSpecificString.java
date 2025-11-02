import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CaseSpecificString {
    public static String caseSort(String s) {
        // code here
     char[] arr = s.toCharArray();
        List<Character> upper = new ArrayList<>();
        List<Character> lower = new ArrayList<>();

        // Separate uppercase and lowercase
        for (char c : arr) {
            if (Character.isUpperCase(c))
                upper.add(c);
            else
                lower.add(c);
        }

        // Sort both lists
        Collections.sort(upper);
        Collections.sort(lower);

        // Merge back based on original case
        StringBuilder result = new StringBuilder();
        int u = 0, l = 0;
        for (char c : arr) {
            if (Character.isUpperCase(c))
                result.append(upper.get(u++));
            else
                result.append(lower.get(l++));
        }

        return result.toString();
    }
    public static void main(String[] args) {
         java.util.Scanner sc = new java.util.Scanner(System.in);
        String s = sc.nextLine();
        String result = caseSort(s);
        System.out.println("Maximum occurring character: " + result);
        sc.close();
     
    }
}
