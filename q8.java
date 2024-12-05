package GFG;
import java.util.Scanner;
public class q8 {
    public static void main(String[] args) {
        // simple calculator for 2 numbers
        Scanner sc=new Scanner(System.in);
        System.out.print("SELECT THE OPERATION : \n1.ADDITION\n2.SUBTRACTION\n3.MULTIPLICATION\n");
        int operation=sc.nextInt(); // operation is 1,2 or 3
        if(operation!= 1 && operation!=2 && operation!=3){
            System.out.println("invalid output");
        }
        else {
            System.out.println("enter first number : ");
            int a = sc.nextInt();
            System.out.println("enter second number : ");
            int b = sc.nextInt();
            if (operation == 1) {
                System.out.println(a + b);
            } else if (operation == 2) {
                System.out.println(a - b);
            } else if (operation == 3) {
                System.out.println(a * b);
            }
        }
    }
}
