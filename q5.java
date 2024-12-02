package GFG;
import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no : ");
        int n= sc.nextInt();
        int y=Math.abs(n); // for absolute value
        int ans=y%10;
        System.out.println("last digit is : " + ans);
    }
}
