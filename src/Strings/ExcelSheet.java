package src.Strings;
import java.util.Scanner;

public class ExcelSheet {
     public static String excelColumn(int n) {

        //  Your code here
         StringBuilder sb = new StringBuilder();
        while (n > 0) {
            n--; // shift to make it 0-indexed (A=0,...Z=25)
            sb.append((char)('A' + n % 26));
            n /= 26;
        }
        return sb.reverse().toString();
    
        
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
            String res=excelColumn(n);
            System.out.println(res);

        sc.close();
    }
}
