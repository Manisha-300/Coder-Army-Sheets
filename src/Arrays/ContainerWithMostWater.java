import java.util.Scanner;

public class ContainerWithMostWater {
     public static int maxWater(int arr[]) {
        // Code Here
         int l = 0, r = arr.length - 1, res = 0;
        while (l < r) {
           int min =(r - l) * Math.min(arr[l], arr[r]);
           res=Math.max(res,min);
            if (arr[l] < arr[r]) l++;
            else r--;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int [] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();

                
                } 
                 int res = maxWater(arr);
                 
                   System.out.println(res);



                sc.close()        ;
    }
}
