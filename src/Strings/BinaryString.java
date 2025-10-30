import java.util.Scanner;

public class BinaryString {
   
     public static int binarySubstring(String s) {
        // code here
          int countOnes = 0;
        
        // Count the number of '1's in the string
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                countOnes++;
            }
        }
        
        // Number of substrings = nC2 = n*(n-1)/2
        return countOnes * (countOnes - 1) / 2;
    
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        String  s=sc.nextLine();
        
        int res= binarySubstring(s);
     System.out.println(res);
     
        sc.close();
        
    }
    
}
