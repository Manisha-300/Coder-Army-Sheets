package src.Arrays;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class  RemovingElement {
 ArrayList<Integer> removeDuplicates(int[] arr) {
    ArrayList<Integer> result = new ArrayList<>();
    HashSet<Integer> seen = new HashSet<>();
    
    for (int num : arr) {
        if (!seen.contains(num)) {
            result.add(num);
            seen.add(num);
        }
    }
    return result;
}
    public static void main(String[] args) {
        RemovingElement re=new RemovingElement();
       Scanner s= new Scanner(System.in);
       int n=s.nextInt();
         int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();


    }
        ArrayList<Integer> res=re.removeDuplicates(arr);
        System.out.println("Array after removing duplicates: " + res);
        s.close();
    
    
    }
    
}
