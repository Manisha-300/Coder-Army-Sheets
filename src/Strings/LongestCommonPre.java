import java.util.Scanner;

public class LongestCommonPre {
    public static String longestCommonPrefix(String arr[]) {
        // code here
     String pre = arr[0];
        for (int i = 1; i < arr.length; i++)
            while (!arr[i].startsWith(pre))
                pre = pre.substring(0, pre.length() - 1);
        return pre;   
    }
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();

       
        String [] s1=new String[n];
        for(int i=0;i<n;i++){
            s1[i]=sc.nextLine();
        }
        String res= longestCommonPrefix(s1);
        System.out.println(res);
        sc.close();
    
    }
}
