package GFG;
import java.util.Scanner;
public class q3 {
    // DAYS BEFORE N DAYS
    //       D      DAYS
    //       0      SUNDAY
    //       1      MONDAY
    //       2      TUESDAY
    //       3      WEDNESDAY
    //       4      THURSDAY
    //       5      FRIDAY
    //       6      SATURDAY
    //  FOR EG D=0 AND N=9 MEANS WE HAVE TO GO BACK 9 DAYS FROM SUNDAY AS D IS 0 ANS WILL BE 5 ie FRIDAY
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("d is : ");
        int d=sc.nextInt();
        System.out.println("n is : ");
        int n=sc.nextInt();
        int x=n%7;
        int ans =d-x;
        if(ans>0){
            System.out.println(ans);
        }
        else{
            System.out.println(ans+7); // so that ans is not negativce
        }
    }
}
