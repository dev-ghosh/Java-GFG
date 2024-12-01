package GFG;
import java.util.Scanner;
public class q4 {
    public static int Nth_term(int d,int a,int n){
        int ans =a+(n-1)*d;
        return ans;
    }

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("enter a : ");
        int a= sc.nextInt();
        System.out.println("enter d : ");
        int d= sc.nextInt();
        System.out.println("enter n  : ");
        int n= sc.nextInt();
        System.out.println("ans is : " + Nth_term(a,d,n));
    }
}
