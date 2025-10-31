package src.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class UnionArrays {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
         HashSet<Integer> set = new HashSet<>();

        // Add all elements from both arrays
        for (int num : a) set.add(num);
        for (int num : b) set.add(num);

        // Convert to list and sort
        ArrayList<Integer> union = new ArrayList<>(set);
        Collections.sort(union);

        return union;
    }
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
       
        int n=sc.nextInt();
        int [] a=new int [n];
        int [] b=new int [n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        ArrayList<Integer> arr=findUnion(a, b);
        
    System.out.println(arr);
    sc.close();
}

}