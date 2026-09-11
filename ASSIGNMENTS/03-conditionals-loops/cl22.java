/* 22. (LeetCode-1281.) Subtract the Product and Sum of Digits of an Integer */
import java.util.*;
class cl22 {
    public static int subtractProductAndSum(int n) {
        int dig, prod=1, sum=0;
        while(n!=0){
            dig=n%10;
            prod=prod*dig;
            sum=sum+dig;
            n=n/10;
        }
        return prod-sum;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int n=sc.nextInt();
        int result=subtractProductAndSum(n);
        System.out.println("Result is "+result);
    }
}
/*
Enter your number
147
Result is 16
 */