package GFG;
import java.util.Scanner;
public class q7 {
    public static void main(String[] args) {
        //greatest of 3 numbers
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int ans_1=Math.max(a,b);
        int ans=Math.max(ans_1,c);
        System.out.println("greatest of them is " + ans);
    }
}
