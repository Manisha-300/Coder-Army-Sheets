import java.util.Scanner;

public class BullsAndCows {
     public static String solve(String secret, String guess) {
         int bulls = 0, cows = 0;
        int[] sCount = new int[10];
        int[] gCount = new int[10];

        for (int i = 0; i < secret.length(); i++) {
            char cs = secret.charAt(i);
            char cg = guess.charAt(i);
            if (cs == cg) {
                bulls++;
            } else {
                sCount[cs - '0']++;
                gCount[cg - '0']++;
            }
        }

        for (int d = 0; d < 10; d++) {
            cows += Math.min(sCount[d], gCount[d]);
        }

        return bulls + "A" + cows + "B";
    
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        
        String  s=sc.nextLine();
        String s2=sc.nextLine();
        String res= solve(s,s2);
     System.out.println(res);
     
        sc.close();
    }
    
}
