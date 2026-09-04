package DAY2.SESSION1;
import java.util.Scanner;
public class ClimbingStairs {
    public static int climbStairs(int n){
    //base case
        if(n==0|| n==1){
          return 1;
        }
        //Recursive case
        return climbStairs(n-1) + climbStairs(n-2);
    }

    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the Number of Stairs: ");
        int n=in.nextInt();
        System.out.println("The Combinations: "+climbStairs(n));
    }       
}

            
    

