package src.Arrays;
import java.util.Scanner;

public class Rearrange {
     public static void rearrange(int arr[]) {
        // code here
        int n= arr.length;
       long max = arr[n - 1] + 1;
        int i = 0, j = n - 1;
        for (int k = 0; k < n; k++)
            arr[k] += ((k % 2 == 0 ? arr[j--] : arr[i++]) % max) * max;
        for (int k = 0; k < n; k++)
            arr[k] /= max;
    }
    public static void main(String[] args) {
         Scanner s= new Scanner(System.in);
           int n=s.nextInt();
                int [] arr=new int[n];
                for(int i=0;i<n;i++){
                    arr[i]=s.nextInt();
                }  

               rearrange(arr);
               s.close();
            }

}
