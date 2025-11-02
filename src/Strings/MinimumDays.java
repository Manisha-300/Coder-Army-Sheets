import java.util.Scanner;

public class MinimumDays {
      public static int getMinimumDays(int P, String S, int[] arr) {
        int n = S.length();
        char[] str = S.toCharArray();
        boolean[] removed = new boolean[n];

        for (int day = 0; day < P; day++) {
            removed[arr[day]] = true; // replace this index with '?'

            if (isValid(str, removed)) {
                return day + 1; // days are 1-indexed
            }
        }

        return P;
    }

    private static boolean isValid(char[] str, boolean[] removed) {
        for (int i = 0; i < str.length - 1; i++) {
            if (!removed[i] && !removed[i + 1] && str[i] == str[i + 1]) {
                return false;
            }
        }
        return true;
    } public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.nextLine();
        int [] arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
              int res=getMinimumDays(n, s, arr);
              System.out.println(res);
              sc.close();
    }
    
}
