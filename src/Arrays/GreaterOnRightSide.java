package src.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class GreaterOnRightSide {
    static ArrayList<Integer> nextGreatest(int arr[]) {
        // code here
        
        int n=arr.length;
        ArrayList<Integer> result=new ArrayList<>();
        int maxFromRight=-1;
        result.add(maxFromRight);
        // we have to add -1 in the last position
        for(int i=n-2;i>=0;i--){
            arr[i+1]=Math.max(arr[i+1],maxFromRight);
            maxFromRight=arr[i+1];
            result.add(arr[i+1]);


        }
        //reverse the result arraylist
        ArrayList<Integer> finalResult=new ArrayList<>();
        for(int i=result.size()-1;i>=0;i--){
            finalResult.add(result.get(i));
        }
        return finalResult;
    }
    public static void main(String[] args) {
       Scanner s= new Scanner(System.in);
           int n=s.nextInt();
                int [] arr=new int[n];
                for(int i=0;i<n;i++){
                    arr[i]=s.nextInt();
                }            
                ArrayList<Integer> res=nextGreatest(arr);
                System.out.println("Array with next greatest elements: " + res);
                s.close();
    }
    
}
