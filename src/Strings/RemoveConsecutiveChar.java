package src.Strings;
public class RemoveConsecutiveChar {
     public static String solve(String s, int b) {
             
       int i=0, j = 0;
        s = s+'$';
        String ans = "";
        int count = 0;
        while(j<s.length()){
            if(s.charAt(i) == s.charAt(j) ){
                count++;
                j++;
            }else{
                if(count != b){
                    ans += s.substring(i,j);
                }
                i=j;count=0;
            }
           
        }
        return ans;
    }
    public static void main(String[] args) {
         java.util.Scanner sc=new java.util.Scanner(System.in);
        String str1=sc.nextLine();
        int  str2=sc.nextInt();
       String st=solve(str1, str2);
       System.out.println(st);
        sc.close();
    }
    
}
