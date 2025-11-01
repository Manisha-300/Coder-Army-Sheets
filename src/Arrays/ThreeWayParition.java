package src.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThreeWayParition {
      public static  void threeWayPartition(int arr[], int a, int b) {
        // code here
   List<Integer> list = new ArrayList<>();
        for (int x : arr)
        { if (x < a) 
            {
                list.add(x);
            }
        }
        for (int x : arr)
        { if (x >= a && x <= b)
            { list.add(x);
            }
        }
        for (int x : arr)
        { if (x > b)
            { list.add(x);}
        }
        for (int i = 0; i < arr.length; i++) 
        {arr[i] = list.get(i);
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         
       int n= sc.nextInt();
       int []arr=new int [n];
       int s=sc.nextInt();
       int b=sc.nextInt();
                     for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
       threeWayPartition(arr, s, b);
        sc.close();
    }
}
