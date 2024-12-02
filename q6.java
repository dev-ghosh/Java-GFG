package GFG;
import java.util.Scanner;
public class q6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter n : ");
        int n= sc.nextInt();
        int sum=n*(n+1)/2;
        System.out.println("sum is " + sum);
    }
}
