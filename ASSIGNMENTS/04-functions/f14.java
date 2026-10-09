/* 14. Write a function that returns the sum of first n natural numbers. */
import java.util.*;
class f14{
    public static int allSum( int n){
        int sum=0;
        for(int j=1; j<=n; j++){
            sum+=j;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the nth number");
        int n=sc.nextInt();
        System.out.println("sum of n natural numbers is "+allSum(n));
    }
}
/*
enter the nth number
4
sum of n natural numbers is 10
 */