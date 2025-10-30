package src.Arrays;
import java.util.Scanner;

public class FindFine {
     public static long totalFine(int date, int car[], int fine[]) {
        // code here
        long  sum=0;
        if(car.length!=fine.length){
            System.out.println("Array lengths do not match");
            
        }
        if(car.length<1 || car.length>100000){
            System.out.println("Invalid array length: " + car.length);
           
        }
        if(date>100000){
            System.out.println("Invalid date: " + date);
           
        }
        if(date%2==0){
            for(int i=0;i<car.length;i++){
                if(car[i]%2!=0){
                    sum+=fine[i];
                }
            }
        }
        else{
            for(int i=0;i<car.length;i++){
                if(car[i]%2==0){
                    sum+=fine[i];
                }
            }
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int date=sc.nextInt();
        int n=sc.nextInt();
        int [] car=new int [n];
        int [] fine=new int [n];
        for(int i=0;i<n;i++){
            car[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            fine[i]=sc.nextInt();
        }
        long result=totalFine(date,car,fine);
        System.out.println("Total fine: "+result);
        sc.close();
    }
}
