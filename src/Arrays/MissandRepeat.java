package src.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MissandRepeat {
    static ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        
        int n = arr.length, dup = -1, miss = -1;
        boolean[] seen = new boolean[n + 1];

        for (int x : arr) {
            if (seen[x]) dup = x;
            seen[x] = true;
        }
        for (int i = 1; i <= n; i++)
            if (!seen[i]) { miss = i; break; }

        return new ArrayList<>(Arrays.asList(dup, miss));
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
           int n=s.nextInt();
                int [] arr=new int[n];
                for(int i=0;i<n;i++){
                    arr[i]=s.nextInt();
                }            
                ArrayList<Integer> res=findTwoElement(arr);
                System.out.println("Array with next greatest elements: " + res);
                s.close();
    }
    
}
