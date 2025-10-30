public class RotatedString {
    public static boolean isRotated(String str1, String str2) {
        // code here
        if(str1.length()!=str2.length()){
            return false;
        }
        String concatenated=str1+str1;
        return concatenated.contains(str2);
    }
    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        boolean result=isRotated(str1,str2);
        if(result){
            System.out.println("The strings are rotations of each other.");
        }
        else{
            System.out.println("The strings are not rotations of each other.");
        }
        sc.close();
    }
    
}
