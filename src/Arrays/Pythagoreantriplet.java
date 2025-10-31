package src.Arrays;

import java.util.Scanner;

public class Pythagoreantriplet {
    static  boolean pythagoreanTriplet(int[] arr) {
        // code here
         int n = arr.length;
        
        // Check all possible triplets
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int a = arr[i], b = arr[j], c = arr[k];
                    
                    // Check all permutations of the triplet
                    if (a * a + b * b == c * c ||
                        a * a + c * c == b * b ||
                        b * b + c * c == a * a) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
         Scanner s= new Scanner(System.in);
           int n=s.nextInt();
                int [] arr=new int[n];
                for(int i=0;i<n;i++){
                    arr[i]=s.nextInt();
                }            
                boolean res=pythagoreanTriplet(arr);
                System.out.println("Array with next greatest elements: " + res);
                s.close();
    }

    
    
}
