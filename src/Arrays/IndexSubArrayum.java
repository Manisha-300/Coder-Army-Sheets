package src.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class IndexSubArrayum {
     static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
     int n=arr.length;
        ArrayList<Integer> result=new ArrayList<>();
        
        int left=0,right=0;
        int currentsum=0;
        while(right <n){
            currentsum+=arr[right];
            
            while(currentsum >target && left<=right){
                currentsum-=arr[left];
                left++;
            }
            if(currentsum ==target){
                result.add(left+1);
                result.add(right+1);
                return result;
            }
            right++;
            
            
        }
        result.add(-1);
        return result;
    }
    public static void main(String[] args) {
       Scanner s= new Scanner(System.in);
       int n=s.nextInt();
         int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int target=s.nextInt();
        ArrayList<Integer> res=subarraySum(arr,target);
        System.out.println("Subarray with given sum: " + res);
        s.close();
    }

    
}
