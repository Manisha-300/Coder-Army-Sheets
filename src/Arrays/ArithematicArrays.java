import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArithematicArrays {
      public static List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
         List<Boolean> result = new ArrayList<>();

        for (int i = 0; i < l.length; i++) {
            int start = l[i], end = r[i];
            int[] sub = Arrays.copyOfRange(nums, start, end + 1);
            Arrays.sort(sub);

            boolean isArithmetic = true;
            int diff = sub[1] - sub[0];

            for (int j = 2; j < sub.length; j++) {
                if (sub[j] - sub[j - 1] != diff) {
                    isArithmetic = false;
                    break;
                }
            }
            result.add(isArithmetic);
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int r=sc.nextInt();

            int [] l=new int [r];
            int [] d=new int [r];

                   int [] arr=new int [r];
                   for(int i=0;i<r;i++){
                    
                        arr[i]=sc.nextInt();
                    }
                   
                   for(int i=0;i<r;i++){
                    l[i]=sc.nextInt();

                   }
                     for(int i=0;i<r;i++){
                    d[i]=sc.nextInt();
                    
                   }
                   List<Boolean> bool=checkArithmeticSubarrays(arr, l, d);
                   System.out.println(bool);
                   sc.close();
    }
}

