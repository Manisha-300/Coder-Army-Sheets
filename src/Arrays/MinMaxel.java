import java.util.ArrayList;
import java.util.Scanner;

public class MinMaxel {

    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int n=arr.length;
            if (n == 1) {
            ArrayList<Integer> li=new ArrayList<>();
            li.add(arr[0]);
            li.add(arr[0]);
            return li;
        }
        

        int min=arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
           
            if(max<arr[i] ){
                max=arr[i];
              
            }if(min>arr[i]){
                min=arr[i];
            }
            
        }
        ArrayList<Integer> li=new ArrayList<>();
        li.add(min);
        li.add(max);
        
        return li;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        MinMaxel obj=new MinMaxel();
        ArrayList<Integer> res=obj.getMinMax(arr);
        System.out.println("Min element is: "+res.get(0));
        System.out.println("Max element is: "+res.get(1));
        
        sc.close();

    }
    
}
